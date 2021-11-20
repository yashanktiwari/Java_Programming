/*
Q2. Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars.
If the inputs are “Mark” and “Kate” then the output should be “markate”.
(The output should be in lowercase)
*/
import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner scan = new Scanner(System.in);
        str1 = scan.nextLine();
        str2 = scan.nextLine();
        String str3;
        if(str1.substring(3).equalsIgnoreCase(str2.substring(0, 1))) {
            System.out.println(str1.toLowerCase()+str2.substring(1).toLowerCase());
        } else {
            System.out.println(str1.toLowerCase()+str2.toLowerCase());
        }
    }
}
