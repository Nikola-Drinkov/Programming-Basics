package CondStatements_Advanced;

import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        boolean isValid = (n>=100&&n<=200)||n==0;
        if(isValid){
        }
        else
            System.out.println("invalid");
    }
}
