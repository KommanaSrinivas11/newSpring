package org.java.SpringTut.firstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con =new ClassPathXmlApplicationContext("springContext.xml");
        
         
         HouseInterface h=con.getBean("house",HouseInterface.class);
        h.enter();
         //e.displayy();
         
        
    }
}
