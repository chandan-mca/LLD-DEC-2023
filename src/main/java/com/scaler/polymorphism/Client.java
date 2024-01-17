package com.scaler.polymorphism;

import com.scaler.polymorphism.Student;
import com.scaler.polymorphism.User;

public class Client {

    public static void main(String[] args) {
        User u = new Student();

//      u.setPsp();
        u.changePassword("hello");
    }
}
