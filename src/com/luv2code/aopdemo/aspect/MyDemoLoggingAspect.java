package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice

	//execution (* -- > any return type, com.luv2code.aopdemo.dao -- > in this package, com.luv2code.aopdemo.dao.* -- > in this package any class,
	// com.luv2code.aopdemo.dao.*.* -- > in this package any classes any method, ".." -- > any number of arguments.
	@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n=====>>> Executing @Before advice on method");
		
	}
}










