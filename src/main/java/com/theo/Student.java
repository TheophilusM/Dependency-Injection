package com.theo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

//@Scope(scopeName = "singletop")     // default scope - same object for every all returned
@Scope(scopeName = "prototype")     // get a new object for every call
public class Student implements Human, BeanNameAware {
    private String university;
    private String courseName;
    private Profile profile;

    public Student(String university) {
        this.setUniversity(university);
    }

    @Override
    public void thePerson() {
        System.out.println("Finished my studies");
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set bean name aware method called");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Set postConstruct method called");
    }
}
