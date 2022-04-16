package com.theo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ///////////////////// using xml configs ////////////////////
        /*
        // object instantiation
        Profile profile = new Profile();
        System.out.println("For object instantiation:");
        profile.thePerson();
        System.out.println();

        // replacement of object instantiation
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Profile profileObj = applicationContext.getBean(Profile.class); // using the class
        System.out.println("For class ref:");
        profileObj.thePerson();
        System.out.println();

        Student student = (Student) applicationContext.getBean("student"); // using the id and casting
        System.out.println("For id ref and casting:");
        student.thePerson();
        System.out.println("University: " + student.getUniversity());
        System.out.println();

        // using implementations
        Human human = applicationContext.getBean(Student.class);
        System.out.println("For implementation:");
        human.thePerson();
        System.out.println();

        */

        ///////////////////// using annotations ////////////////////
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Work work = applicationContext.getBean(Work.class); // using the class
        work.thePerson();
    }
}
