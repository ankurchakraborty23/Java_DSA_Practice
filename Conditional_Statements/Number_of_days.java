package Conditional_Statements;
import java.io.*;
public class Number_of_days {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the month name :");
        String month = br.readLine();
        switch (month) {
            case "January":
                System.out.println("The number of days of "+month+" is 31.");
                break;
            case "February":
                System.out.println("The number of days of "+month+" is 28.");
                break;
            case "March":
                System.out.println("The number of days of "+month+" is 31.");
                break;
            case "April":
                System.out.println("The number of days of "+month+" is 30.");
                break;
            case "May":
                System.out.println("The number of days of "+month+" is 31.");
                break;
            case "June":
                System.out.println("The number of days of "+month+" is 30.");
                break;
            case "July":
                System.out.println("The number of days of "+month+" is 31.");
                break;
            case "August":
                System.out.println("The number of days of "+month+" is 31.");
                break;
            case "September":
                System.out.println("The number of days of "+month+" is 30.");
                break;
            case "October":
                System.out.println("The number of days of "+month+" is 31.");
                break;
            case "November":
                System.out.println("The number of days of "+month+" is 30.");
                break;
            case "December":
                System.out.println("The number of days of "+month+" is 31.");
                break;
            default:
                System.out.println("Invalid Month");
        }

    }
}
