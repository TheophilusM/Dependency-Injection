package com.theo;

public class Student implements Human {
    private String university;

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
}
