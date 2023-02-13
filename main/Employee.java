package main;

public class Employee {

    private String firstName, lastName;
    private String title, address, sex;
    private int age;

    Employee(String firstName, String lastName, String title, String address, String sex, int age){
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.title      = title;
        this.address    = address;
        this.sex        = sex;
        this.age        = age;
    }

    Employee(String firstName, String lastName, String title){
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.title      = title;
        address = "N/A";
        sex = "N/A";
        age = 0;
    }

    Employee(){
        firstName = "N/A";
        lastName = "N/A";
        title = "N/A";
        address = "N/A";
        sex = "N/A";
        age = 0;
    }

    String getFirstName(){
        return firstName;
    }

}
