package ConditionalStatements_Exercise;

import java.util.Scanner;

public class BonusScore02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double bonus = 0;
        if(n<=100) {
            bonus =5;
        }
        else if(n<1000) {
            bonus =n*0.20;
        }
        else if(n>1000) {
            bonus =n*0.10;
        }
        if(n%2==0) {
            bonus += 1;
        }
        else if(n%5==0) {
            bonus+=2;
        }
        System.out.println(bonus);
        System.out.println(bonus+n);
    }
}
