package MockExam2020;

import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String airline = sc.nextLine();
        int countAdult = Integer.parseInt(sc.nextLine());
        int countChildren = Integer.parseInt(sc.nextLine());
        double priceAdult = Double.parseDouble(sc.nextLine());
        double priceChildren=priceAdult-priceAdult*0.7;
        double service = Double.parseDouble(sc.nextLine());

        priceAdult=priceAdult+service;
        priceChildren=priceChildren+service;
        double total = countAdult*priceAdult+countChildren*priceChildren;
        double profit = total*0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",airline,profit);
    }
}
