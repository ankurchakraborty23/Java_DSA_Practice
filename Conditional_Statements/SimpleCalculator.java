package Conditional_Statements;
import java.util.*;
public class SimpleCalculator {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter symbol(+, -, *, /, %, ^) for calculations :");
        char symbol = in.next().charAt(0);
        switch (symbol) {
            case '+':
                System.out.println("Enter two numbers ;");
                int add1 = in.nextInt();
                int add2 = in.nextInt();
                System.out.println("Sum of "+add1+" and "+add2+" is "+(add1+add2));
                break;
            case '-':
                System.out.println("Enter two numbers ;");
                int sub1 = in.nextInt();
                int sub2 = in.nextInt();
                System.out.println("Subtraction of "+sub1+" and "+sub2+" is "+(sub1-sub2));
                break;
            case '*':
                System.out.println("Enter two numbers ;");
                int mul1 = in.nextInt();
                int mul2 = in.nextInt();
                System.out.println("Multiplication of "+mul1+" and "+mul2+" is "+(mul1*mul2));
                break;
            case '/':
                System.out.println("Enter two numbers ;");
                int div1 = in.nextInt();
                int div2 = in.nextInt();
                System.out.println("Division of "+div1+" and "+div2+" is "+(div1/div2));
                break;
            case '%':
                System.out.println("Enter two numbers ;");
                int mod1 = in.nextInt();
                int mod2 = in.nextInt();
                System.out.println("Modulus of "+mod1+" is "+(mod1%mod2));
                break;
            case '^':
                System.out.println("Enter two numbers ;");
                int pow1 = in.nextInt();
                int pow2 = in.nextInt();
                System.out.println("Power of "+pow1+" is "+(Math.pow(pow1,pow2)));
                break;
            default:
                System.out.println("Invalid Symbol");
        }
    }
}
