package com.scaler.introToOOP;

public class Client {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.age = 25;

        Student student2 = new Student();
        student2.age = 20;
        student2.batch = "DEC-2023";
        student2.coursePause(2);
    }
}
