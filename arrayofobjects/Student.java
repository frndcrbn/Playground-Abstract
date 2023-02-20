package arrayofobjects;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private int year;
    private String course;
    private String section;

    Student(String firstName, String lastName, int year, String course, String section){
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.course = course;
        this.section = section;
    }

    public void displayInfo(){
        System.out.println("Full name:  " + firstName + " " + lastName);
        System.out.println("Year:       " + year);
        System.out.println("Course:     " + course);
        System.out.println("Section :   " + section);
        System.out.println();
    }
}
