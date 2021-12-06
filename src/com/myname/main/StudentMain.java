package com.myname.main;

/*
A program to demonstrate custom exceptions.
Create a com.myname.stuent.Student class with three private fields name, rollNo, & CPI.
Create Getter and Setter for all the fields, override the public String toString() method of Object class,
to represent Student objects as String. Create a com.myname.main.StudentMain class which is the implementation class
contains main method and a search() method. main method will create a list of students i.e array and initialize
each objects by taking input from user using java.util.Scanner class.
This method will also call search method and print the result.
search() method will accept two arguments first is Student[] list and int rollNo.
This method will return Student object if rollNo matches with any of the Student object or else
it will throw an user defined exception InvalidStudentException. com.myname.exception.
InvalidStudentException is a class which extends java.lang.Exception class and have one parameterized constructor
which accept an argument String message.
*/
import com.myname.student.Student;
import java.util.Scanner;

class InvalidStudentException extends RuntimeException {
    public InvalidStudentException(String str){
        super(str);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student obj;
        Scanner scan = new Scanner(System.in);
        Student[] stu = new Student[2];
        for(int i=0; i<2; i++) {
            stu[i] = new Student();
            String name = scan.nextLine();
            int rollno = scan.nextInt();
            double CPI = scan.nextDouble();
            stu[i].setName(name);
            stu[i].setRollno(rollno);
            stu[i].setCPI(CPI);
            scan.nextLine();
        }
        int rollNo = scan.nextInt();
        obj = search(stu, rollNo);

        obj.toString();
    }

    public static Student search(Student[] list, int rollno) {
        for(int i=0; i<2; i++) {
            if(list[i].getRollno() == rollno) {
                return list[i];
            }
        }
        throw new InvalidStudentException("Roll no does not match");
    }
}
