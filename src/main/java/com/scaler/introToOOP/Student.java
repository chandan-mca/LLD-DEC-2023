package com.scaler.introToOOP;

public class Student {

    int id;
    String name;
    String gender;
    int age;
    String batch;

    void batchChange(String newBatch){
        batch = newBatch;
    }

    void coursePause(int duration){
        batch = null;
        System.out.println("Course Pause for "+ duration +" months.");
    }
}
