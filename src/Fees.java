import java.util.Scanner;

/*
Q2. At GLA College of  Programming, the final school fees to be paid is calculated as follows.
•	Original Fees should be greater than or equal to R50 000
•	Minimum fixed deposit of R10 000
•	If a deposit is greater than pr equal to half the original fees, you get a 5% discount from the original fees
•	Final total fees will also include the following
1.	School Levy is 10% of original fees
2.	Sports fee is 5% of the original fees.
Write a program the calculates the final total fees to be paid.

Program must request user to enter original fees value greater then R50 000.
Program should also request user to enter amount to deposit before calculating final total fees.
 */

public class Fees {
    double fees;
    double deposit;
    double levy;
    double sportsFee;
    Fees() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Please enter the fees greater than 50000");
            fees = scan.nextDouble();
        } while(fees < 50000);
        System.out.println("Please enter the amount deposited");
        deposit = scan.nextDouble();
        levy = fees/10;
        sportsFee = fees/20;
    }
}

class mainFees {
    public static void main(String[] args) {
        Fees obj = new Fees();
        if(obj.deposit>=(obj.fees)/2) {
            System.out.println(obj.fees+obj.levy);
        } else {
            System.out.println(obj.fees+obj.levy+obj.sportsFee);
        }
    }
}