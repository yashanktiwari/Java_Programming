import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        int st = 0, end = s.length()-1;
        while(st<=end) {
            if(s.charAt(st) != s.charAt(end)) {
                System.out.println("Not Palindrome");
                break;
            }
            st++;
            end--;
        }
        if(st>end)
            System.out.println("Palindrome");
        scan.close();
    }
}
