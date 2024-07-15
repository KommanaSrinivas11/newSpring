package org.java.SpringTut.firstSpring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component


public class AspectDemo {
	

@Around("execution(public void org.java.SpringTut.firstSpring.House.enter())")
public void check(ProceedingJoinPoint joinPoint) throws Throwable{

	 	System.out.println("Check surroundings");
	 	joinPoint.proceed(); 

}
/*
@After("execution(public void org.java.SpringTut.firstSpring.House.enter())")
public void afterEnter() {
	System.out.println("checkedout");
}
*/
}
