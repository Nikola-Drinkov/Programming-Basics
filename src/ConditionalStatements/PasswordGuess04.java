package ConditionalStatements;

import java.util.Scanner;

public class PasswordGuess04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        String password1 = "s3cr3t!P@ssw0rd";
        if(password.equals(password1)){
            System.out.println("Welcome");
        }
        else
        System.out.println("Wrong password!");
    }

}
