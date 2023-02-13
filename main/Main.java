package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee e = new Employee("Boo","oop","title", "address","m",12);
        Employee e1 = new Employee("kiii","ppoo", "sdasd");
        Employee e2 = new Employee();
        System.out.println(e.getFirstName());
        System.out.println(e1.getFirstName());
        System.out.println(e2.getFirstName());
    }

}
