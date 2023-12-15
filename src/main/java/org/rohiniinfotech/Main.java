package org.rohiniinfotech;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
   //now go to resources and right click and create file as applicationContext.xml
        //then copy past the code that's under(The equivalent file in the XML Schema-style would be..)
        // in the following url https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html
        //now create bean tag in the applicationContext.xml
        //and write this code
        //<bean id="rbi" class="org.rohiniinfotech.Canada"></bean>
        //later run the amin method code we can see the output of the respected class
        // that was specified in the bean tag

        RBI rbi=context.getBean("rbi",RBI.class);
        rbi.deposit();
        rbi.goldloan();
        rbi.internetbanking();
        rbi.loan();
        rbi.withdraw();
        }
}