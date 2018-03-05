package com.luv2code.aopdemo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class TestAdvicesDemoApp {

	private static Logger myLogger = 
					Logger.getLogger(TestAdvicesDemoApp.class.getName());
			
	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		myLogger.info("\nMain Program");
		
		myLogger.info("Calling findAccount");
		
		boolean tripWire = false;
		List<Account> accounts = theAccountDAO.findAccounts(tripWire);
				
		myLogger.info("Finished");
		
		// close the context
		context.close();
	}

}










