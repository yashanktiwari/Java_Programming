package ExceptionQuestions;
/*
Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class)
and ensure that the age entered is >=18 and < 60.
Display proper error messages.

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)
*/

class AgeOutOfRange extends RuntimeException {
    AgeOutOfRange(String str) {
        super(str);
    }
}

public class Test5 {
    public static void main(String[] args) {
        String name = args[0];
        int age;
        try{
            age = Integer.parseInt(args[1]);
            try {
                if (age < 18 || age >= 60) {
                    throw new AgeOutOfRange("Age should be above or equal to 18 and less than 60");
                }
            } catch(AgeOutOfRange e) {
                System.out.println("Exception: " + e);
            }
        } catch(NumberFormatException e) {
            System.out.println("Exception: " + e);
        }

    }
}
