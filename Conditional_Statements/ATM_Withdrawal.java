package Conditional_Statements;
import java.util.*;
public class ATM_Withdrawal {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int balance = 10000;
        System.out.println("Enter you amount for withdrawal :");
        int withdrawal = in.nextInt();
        if(withdrawal > 0) {
            if(withdrawal <= balance) {
                if(withdrawal % 100 == 0) {
                    System.out.println("Withdrawal Successful");
                    System.out.println("Remaining amount : "+(balance - withdrawal));
                }else {
                    System.out.println("Amount must be multiple of 100.");
                }
            }else {
                System.out.println("Insufficient Balance");
            }
        }else {
            System.out.println("Amount should be greater than 0.");
        }
    }
}
