package com.myname.main;

/*

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
