package Conditional_Statements;
import java.io.*;
public class LoginSystem {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String correctUsername = "ankurchakraborty23";
        String correctPassword = "ankur23";
        System.out.println("Enter your username :");
        String username = br.readLine();
        System.out.println("Enter your password :");
        String password = br.readLine();
        if(username.equals(correctUsername)) {
            if(password.equals(correctPassword)) {
                System.out.println("You are successfully logged in.");
            }else {
                System.out.println("Incorrect Password.");
            }
        }else {
            System.out.println("Username does not exist.");
        }
    }
}
