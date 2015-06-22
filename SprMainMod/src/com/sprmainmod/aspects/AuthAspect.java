package com.sprmainmod.aspects;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;



@Aspect
public class AuthAspect {
	@Around("checkAuthUser1()")
	public String checkAuthUser() {
		System.out.println("Auth Aspect::");
		
		return "false";
	}
	@Pointcut("execution(*  *.ch*(..))")
	public void checkAuthUser1() {
		
	}
	
}
