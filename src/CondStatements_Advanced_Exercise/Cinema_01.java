package CondStatements_Advanced_Exercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int columns = Integer.parseInt(sc.nextLine());
        double income = rows*columns;

        switch (type){
            case "Premiere":
               income = income*12.00;
               break;
            case "Normal":
                income = income*7.50;
                break;
            case "Discount":
                income = income*5.00;
                break;
        }
        System.out.printf("%.2f leva",income);
    }
}
