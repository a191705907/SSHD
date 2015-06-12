package Feiz.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitApplicationContext {

    private static ApplicationContext context = null;

    private InitApplicationContext(){

    }
    public static ApplicationContext getApplicationContext(){
        if(context == null){
            context = new ClassPathXmlApplicationContext("applicationContext.xml");
        }
        return context;
    }
}