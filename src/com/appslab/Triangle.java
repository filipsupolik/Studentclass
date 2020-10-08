package com.appslab;

public class Triangle {
    int sideA;
    int sideB;
    int sideC;
    int area;
    int perimeter;

    public Triangle(int i, int i1, int i2) {

    }


    public int getArea() {
        int s = perimeter/2;
        double area1 = Math.sqrt(s-(s-sideA)*(s-sideB)*(s-sideC));
        area = (int) area1;
        return area;
    }

    public int getPerimeter() {
        perimeter = sideA+sideB+sideC;
        return perimeter;
    }
}
