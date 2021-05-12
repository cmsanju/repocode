package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmpDao dao = (EmpDao)ctx.getBean("edao");
		
		Employee e = new Employee();
		
		e.setName("Alekya1");
		e.setCmp("E Y");
		e.setSalary("67890");
		
		//dao.save(e);
		
		dao.update(e);
		
		System.out.println("Done.");
	}

}
