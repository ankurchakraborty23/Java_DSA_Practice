package Loops;
import java.util.*;
public class Numbers_using_dowhile {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n = in.nextInt();
        int i = 1;
        do{
            System.out.print(i+ " ");
            i++;
        }while(i <= n);
    }
}
