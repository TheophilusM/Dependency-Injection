package com.theo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // object instantiation
        Profile profile = new Profile();
        System.out.println("For object instantiation");
        profile.thePerson();

        // replacement of object instantiation
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Profile profileObj = applicationContext.getBean(Profile.class); // using the class
        System.out.println("For class ref:");
        profileObj.thePerson();

        Student student = (Student) applicationContext.getBean("student"); // using the id and casting
        System.out.println("For id ref and casting:");
        student.thePerson();

        // using implementations
        Human human = applicationContext.getBean(Student.class);
        System.out.println("For implementation:");
        human.thePerson();

    }
}
