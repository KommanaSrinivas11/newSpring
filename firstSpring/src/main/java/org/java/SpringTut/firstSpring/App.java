package org.java.SpringTut.firstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con =new ClassPathXmlApplicationContext("springContext.xml");
         //Bank b = (Bank)con.getBean("statebank");
         //b.name();
         demoB e =con.getBean("b",demoB.class);
         e.displayy();
         
        
    }
}
