package ExceptionQuestions;

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
