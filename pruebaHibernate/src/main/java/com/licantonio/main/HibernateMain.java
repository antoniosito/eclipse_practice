/**
 * 
 */
package com.licantonio.main;

import java.util.Date;

import org.hibernate.Session;

import com.licantonio.hibernate.model.Employee;
import com.licantonio.hibernate.model.Employee1;
import com.licantonio.util.HibernateUtil;

/**
 * @author LuisAntonio
 *
 */
public class HibernateMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Employee employee = new Employee();
		Employee1 employee = new Employee1();
		employee.setName("Pablito");
		employee.setRole("CEO");
		employee.setInsertTime(new Date());
		
		Session session = HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		System.out.println("Employee ID="+employee.getId());
		
		HibernateUtil.getSessionFactory().close();

	}

}
