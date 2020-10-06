package com.appslab;

public class Person {
    String name;
    int age;
    int budget;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getBudget() {
        return budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Person (String name, int age, int budget) {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }
}
