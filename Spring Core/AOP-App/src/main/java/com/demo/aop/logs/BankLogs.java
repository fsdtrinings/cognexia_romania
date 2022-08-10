package com.demo.aop.logs;

import java.time.LocalDate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.demo.aop.bean.BankAccount;

@Aspect
@Component
public class BankLogs {
	
	@Pointcut("execution(* void com.demo.aop.service.*.do*(..))")
	//@Before("execution(* void com.demo.aop.service.*.do*(..))")
	public void writeCommonLogs()
	{
		System.out.println("INFO :- DO Action called  ");
	}
	
	
	@Before("execution(public int checkBalance(..))")
	public void writeLogs()
	{
		System.out.println("INFO :- User action executed "+LocalDate.now());
	}
	
	@After("execution(public int checkBalance(..))")
	public void writeLogs2()
	{
		System.out.println("INFO :- User action executed "+LocalDate.now());
	}
	
	
	
	@AfterReturning(pointcut = "execution(public int do*(..))",returning = "abc")
	public void logforReturnStatement(JoinPoint joinPoint,int abc)
	{
		
		 Object arr[] = joinPoint.getArgs();
		 
		 for (Object obj : arr) {
			if(obj instanceof BankAccount) {
				String accountName = ((BankAccount)obj).getName();
				System.out.println(" INFO :- accountName "+accountName);
			}
			
		}
		
		System.out.print(" Deposit "+abc+" Amount "+LocalDate.now()+"\n-------------\n");
	}
	
	@AfterThrowing(pointcut = "execution(public int do*(..))",throwing = "abc")
	public void logforReturnStatement(JoinPoint joinPoint,Exception abc)
	{
		
		 Object arr[] = joinPoint.getArgs();
		 
		 for (Object obj : arr) {
			if(obj instanceof BankAccount) {
				String accountName = ((BankAccount)obj).getName();
				System.out.println(" INFO :- accountName "+accountName);
			}
			
		}
		
		System.out.print(" Withdrawal use case  "+abc+" -  "+LocalDate.now()+"\n-------------\n");
	}
	
	
	
	

}
