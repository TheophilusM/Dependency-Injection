package com.theo;

import org.springframework.context.annotation.Scope;

//@Scope(scopeName = "singletop")     // default scope - same object for every all returned
@Scope(scopeName = "prototype")     // get a new object for every call
public class Student implements Human {
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
}
