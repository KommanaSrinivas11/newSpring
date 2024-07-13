package org.java.SpringTut.firstSpring;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component


public class AspectDemo {
	
@
public void check()
{
	System.out.println("Check surroundings");
}
}
