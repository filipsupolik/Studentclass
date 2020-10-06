package com.appslab;

public class Main {

    public static void main(String[] args) {
       Person people [] = new Person[3];
       Person people1 = new Person("John",12,500);
       Person people2 = new Person("Steve", 28,1500);
       Person people3 = new Person("Martin", 49, 2280);

       people[0] = people1;
       people[1] = people2;
       people[2] = people3;

       System.out.println(calculateBudged(people));
    }

    public static int calculateBudged(Person[] people) {
        int budget = 0;
        for (int i = 0; i< people.length; i++) {
            budget += people[i].budget;
        }
        return budget;
    }
}
