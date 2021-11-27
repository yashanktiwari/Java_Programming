package ExceptionQuestions;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in the array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0; i<n; i++) {
            try {
                arr[i] = Integer.parseInt(scan.next());
            } catch(NumberFormatException e) {
                System.out.println("Exception: " + e);
            }
        }

        System.out.println("Enter the index of the array element you want to access");
        int i = scan.nextInt();
        try {
            System.out.println(arr[i]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }
}