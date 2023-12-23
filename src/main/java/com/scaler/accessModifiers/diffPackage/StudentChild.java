package com.scaler.accessModifiers.diffPackage;

import com.scaler.accessModifiers.myPackage.Student;

public class StudentChild extends Student {
    void m1() {
        //id = 101;              // private not allowed
        //name = "Chandan";      // default not allowed
        gender = "Male";         // protected allowed
        age = 21;                // public allowed
    }

    void m2() {

        Student student = new Student();
        //student.id = 101;              // private not allowed
        //student.name = "Chandan";      // default not allowed
        //student.gender = "Male";       // protected allowed
        student.age = 21;                // public allowed

        // Only public are going to be visible
        // because if child tries to access attributes of a parent
        // via an object of it, they are considered a third party code
    }
}
