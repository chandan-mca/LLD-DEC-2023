package com.scaler.accessModifiers.diffPackage;

import com.scaler.accessModifiers.myPackage.Student;

public class StudentChild extends Student {
    public static void main(String[] args) {

        StudentChild student1 = new StudentChild();
        //student1.id = 101;              // private not allowed
        //student1.name = "Chandan";      // default not allowed
        student1.gender = "Male";         // protected not allowed
        student1.age = 21;                // public allowed
    }
}
