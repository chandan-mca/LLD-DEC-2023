package com.scaler.accessModifiers.myPackage;

public class Student {

    private int id;
    String name;
    protected String gender;
    public int age;
    public String batch;

    private void pauseCourse(int duration) {
        id = 123;
        name = "ABC";
        batch = null;
        System.out.println("Paused the course");
    }
}
