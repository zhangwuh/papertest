package com.symbio.supplyQuery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zhang Wuhui on 5/30/16
 */
public class App {
    public static void main(String... args){
        System.out.println("System starting");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }


}