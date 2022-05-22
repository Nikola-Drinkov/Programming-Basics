package CondStatements_Advanced_Exercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priceRoses = 5.00;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3.00;
        double priceGladiolus = 2.50;

        String flower = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());
        double price = 0;

        switch (flower){
            case "Roses":
                price = count*priceRoses;
                if(count>80){
                    price-=price*0.10;
                }
                break;
            case "Dahlias":
                price = count*priceDahlias;
                if(count>90){
                    price-=price*0.15;
                }
                break;
            case "Tulips":
                price = count*priceTulips;
                if(count>80){
                    price-=price*0.15;
                }
                break;
            case "Narcissus":
                price = count*priceNarcissus;
                if(count<120){
                    price+=price*0.15;
                }
                break;
            case "Gladiolus":
                price = count*priceGladiolus;
                if(count<80){
                    price+=price*0.20;
                }
                break;
        }
        if(price<=budget){
            double excess = budget-price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, excess);
        }
        else{
            double shortage = price-budget;
            System.out.printf("Not enough money, you need %.2f leva more.",shortage);
        }
    }
}
