package arrayofobjects;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        Student student[] = new Student[num];

        for (int i = 0; i < student.length; i++){
            System.out.println("Student#" + (i+1));
            System.out.print("Enter Firstname: ");
            String fname = scanner.next();
            System.out.print("Enter Lastname: ");
            String lname = scanner.next();
            System.out.print("Enter Year: ");
            int yr = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Course: ");
            String course = scanner.next();
            System.out.print("Enter Section: ");
            String section = scanner.next();
            student[i] = new Student(fname, lname, yr, course, section);
        }

        for (Student s : student){
            s.displayInfo();
        }
    }
}
