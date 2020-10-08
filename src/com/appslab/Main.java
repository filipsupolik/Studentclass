package com.appslab;

public class Main {

    public static void main(String[] args) {


        Triangle triangle = new Triangle(4,5,6);

        System.out.println("Perimeter is:" + triangle.getPerimeter());
        System.out.println("Area is:" + triangle.getArea());
    }
}
