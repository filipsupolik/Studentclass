package com.appslab;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student student1 = new Student();
        student1.name = "John";
        student1.studentnumber = 5;
        student1.address = "Legionarska 1, 01001 Zilina";
        student1.phonenumber = 12345;


        Student student2 = new Student();
        student2.name = "Sam";
        student2.studentnumber = 2;
        student2.address = "Legionarska 2, 01001 Zilina";
        student2.phonenumber = 456789;


        System.out.println(student1.getStudentnumber() + ", " + student1.getPhonenumber() + ", " + student1.getAddress());

        System.out.println(student2.getStudentnumber() + ", " + student2.getPhonenumber() + ", " + student2.getAddress());
    }
}
