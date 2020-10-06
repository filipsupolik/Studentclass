package com.appslab;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student student1 = new Student();
        student1.name = "John";
        student1.studentnumber = 12345;


        System.out.println(student1.getName());
        System.out.println(student1.getStudentnumber());
    }
}
