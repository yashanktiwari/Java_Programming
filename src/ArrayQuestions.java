import java.util.Scanner;

public class ArrayQuestions {
    public static void main(String[] args) {
        /*
        Given an array of type int, print true if every element is 1 or 4.
         */
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            arr[i] = scan.nextInt();
        }
        int j;
        for(j=0; j<5; j++) {
            if(arr[j] != 1 && arr[j] !=4) {
                System.out.println("false");
                break;
            }
        }
        if(j==5)
            System.out.println("true");


    }
}
