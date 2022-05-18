package ConditionalStatements_Exercise;

import java.util.Scanner;

public class ToyShop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pricePuzzle = 2.60;
        double priceDoll = 3;
        double priceBear = 4.10;
        double priceMinion = 8.20;
        double priceTruck = 2;

        double priceVacation = Double.parseDouble(sc.nextLine());

        int countPuzzle = Integer.parseInt(sc.nextLine());
        int countDoll = Integer.parseInt(sc.nextLine());
        int countBear = Integer.parseInt(sc.nextLine());
        int countMinion = Integer.parseInt(sc.nextLine());
        int countTruck = Integer.parseInt(sc.nextLine());

        int count = countPuzzle+countDoll+countBear+countMinion+countTruck;
        double profit = pricePuzzle*countPuzzle+priceDoll*countDoll+priceBear*countBear+priceMinion*countMinion+priceTruck*countTruck;
        if(count>=50) {
            profit -=profit*0.25;
        }
        profit -=profit*0.10;

        double remaining = priceVacation-profit;
        double extra = profit-priceVacation;
        if(profit>=priceVacation) {
            System.out.printf("Yes! %.2f lv left.",extra);
        }
        else
            System.out.printf("Not enough money! %.2f lv needed.", remaining);
    }
}
