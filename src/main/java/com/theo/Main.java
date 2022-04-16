package com.theo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // object instantiation
        /*
        Profile profile = new Profile();
        profile.myName();
        */

        // replacement of object instantiation
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Profile profile = applicationContext.getBean(Profile.class);
        profile.myName();

    }
}
