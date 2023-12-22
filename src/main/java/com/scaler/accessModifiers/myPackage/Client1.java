package com.scaler.accessModifiers.myPackage;

public class Client1 {
    public static void main(String[] args) {

        Student student1 = new Student();
       //student1.id = 101;             // private not allowed
        student1.name = "Chandan";      // default allowed
        student1.gender = "Male";       // protected allowed
        student1.age = 21;              // public allowed
    }
}
