package CondStatements_Advanced_Exercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget =Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        double price = 0;

        switch (season){
            case "Spring":
             price = 3000;
             if(count<=6){
                 price-=price*0.10;
             }
             else if(count>7&&count<=11){
                 price-=price*0.15;
             }
             else{
                 price-=price*0.25;
             }
             break;
            case "Summer":
            case "Autumn":
                price=4200;
                if(count<=6){
                    price-=price*0.10;
                }
                else if(count>7&&count<=11){
                    price-=price*0.15;
                }
                else{
                    price-=price*0.25;
                }
                break;
            case "Winter":
                price = 2600;
                if(count<=6){
                    price-=price*0.10;
                }
                else if(count>7&&count<=11){
                    price-=price*0.15;
                }
                else{
                    price-=price*0.25;
                }
                break;
        }
        if(count%2==0&&!season.equals("Autumn")){
            price-=price*0.05;
        }
        if(price<=budget){
            double excess = budget-price;
            System.out.printf("Yes! You have %.2f leva left.",excess);
        }
        else{
            double shortage = price-budget;
            System.out.printf("Not enough money! You need %.2f leva.", shortage);
        }
    }
}
