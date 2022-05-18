package ConditionalStatements_Exercise;

import java.util.Scanner;

public class GodzillaVsKingKong05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int statists = Integer.parseInt(sc.nextLine());
        double priceClothes = Double.parseDouble(sc.nextLine());
        double priceStatists = statists*priceClothes;
        double priceDecor = budget*0.10;
        if(statists>150) {
            priceStatists-=priceStatists*0.10;
        }
        double totalPrice = priceDecor+priceStatists;

        double needed = totalPrice-budget;
        double extra = budget-totalPrice;

        if(totalPrice>budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", needed);
        }
        else if (totalPrice<=budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", extra);
        }
    }
}
