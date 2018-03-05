package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// pointcut declaration syntax.
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	
	// how to inject to the advice the created pointcut.
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {		
		System.out.println("\n=====>>> Executing @Before advice on method");		
	}
	
	// multiple advice declarations, if you do not spesificially mention the before order, spring will evaluate it by ascending character order.
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		System.out.println("\n=====>>> Performing API analytics");		
	}
	
	
}










