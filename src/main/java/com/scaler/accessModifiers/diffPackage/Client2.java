package com.scaler.accessModifiers.diffPackage;

import com.scaler.accessModifiers.myPackage.Student;

public class Client2 {

    public static void main(String[] args) {

        Student student1 = new Student();
        //student1.id;              // private not allowed
        //student1.name;            // default not allowed
        //student1.gender;          // protected not allowed
        student1.age = 21;          // public allowed
    }
}
