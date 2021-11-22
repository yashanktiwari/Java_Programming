import java.util.Scanner;
public class ArrayException {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            arr[i] = scan.nextInt();
        }
        for(int j=0; j<5; j++) {
            System.out.println(arr[j]);
        }
    }
}
