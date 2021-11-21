/*
Write a program to initialize an integer array with values and check if a given number is present in the array or not.
*/

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int i = 0;
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);
        for(; i<5; i++) {
            arr[i] = scan.nextInt();
        }
        int key = scan.nextInt();
        scan.close();
        for(i=0; i<5; i++) {
            if(key==arr[i]) {
                System.out.println(i+1);
                break;
            }
        }
        if(i==5)
            System.out.println(-1);
    }
}
