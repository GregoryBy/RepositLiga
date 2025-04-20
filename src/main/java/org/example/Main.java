package org.example;


public class Main {


    public static void main(String[] args) {




            System.out.println("Second commit");

        Cat Firstcat = new Cat("чёрный", "барсик", 3);
        Cat Secondcat = new Cat("белый", "борис", 2);

        System.out.println("Данные первого кота:" + Firstcat.getName()
                + ", " + Firstcat.getAge() + ", " + Firstcat.getColor());
        System.out.println("Данные второго кота:" + Secondcat.getName()
                + ", " + Secondcat.getAge() + ", " + Secondcat.getColor());
    }
}


