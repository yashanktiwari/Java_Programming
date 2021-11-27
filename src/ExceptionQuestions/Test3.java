package ExceptionQuestions;

/*
Write a Program to take care of Number Format Exception if the user enters values other than integer for calculating
the average marks of 2 students.
The name of the students and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and values out of range
(i.e. other than in the range of 0-100).
Exception Handling: Throw & User Defined Exception
*/
import java.util.Scanner;

class OutOfRange extends RuntimeException {
    OutOfRange(String str1) {
        super(str1);
    }
}

class NegativeValues extends RuntimeException {
    NegativeValues(String str2) {
        super(str2);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n1, n2;
        System.out.println("Enter the name of the first student");
        n1 = scan.next();
        System.out.println("Enter the name of the second student");
        n2 = scan.next();
        System.out.println("Enter the marks of the first student and then of the second student in 3 subjects");
        int s1m1, s1m2, s1m3, s2m1, s2m2, s2m3;
        try {
            s1m1 = Integer.parseInt(scan.next());
            s1m2 = Integer.parseInt(scan.next());
            s1m3 = Integer.parseInt(scan.next());
            s2m1 = Integer.parseInt(scan.next());
            s2m2 = Integer.parseInt(scan.next());
            s2m3 = Integer.parseInt(scan.next());
            try {
                if (s1m1 < 0 || s1m2 < 0 || s1m3 < 0 || s2m1 < 0 || s2m2 < 0 || s2m3 < 0) {
                    throw new NegativeValues("Marks cannot be negative");
                } else if(s1m1 > 100 || s1m2 > 100 || s1m3 > 100 || s2m1 > 100 || s2m2 > 100 || s2m3 > 100) {
                    throw new OutOfRange("Marks cannot be greater than 100");
                }

                System.out.println("The average of " + n1 + " is " + (s1m1+s1m2+s1m3)/3);
                System.out.println("The average of " + n2 + " is " + (s2m1+s2m2+s2m3)/3);
            } catch(NegativeValues | OutOfRange e1) {
                System.out.println("Exception: " + e1);
            }
        } catch(NumberFormatException e) {
            System.out.println("Exception: " + e);
        }
    }
}
