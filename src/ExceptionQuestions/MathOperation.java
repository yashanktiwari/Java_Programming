package ExceptionQuestions;
/*
Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters.
Loop through the array and obtain the sum and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.
*/
public class MathOperation {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0; i<5; i++) {
            try {
                sum = Integer.parseInt(args[i]);
            } catch(Exception e) {
                System.out.println("Exception: " + e);
            }
        }
        int average;
        try {
            average = sum / 5;
            System.out.println(sum);
            System.out.println(average);
        } catch(Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
