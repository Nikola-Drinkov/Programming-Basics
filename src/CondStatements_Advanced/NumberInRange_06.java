package CondStatements_Advanced;

import java.util.Scanner;

public class NumberInRange_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = Double.parseDouble(sc.nextLine());
        boolean isValid = n>=-100 && n<=100 && n!=0;
        if(isValid){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
