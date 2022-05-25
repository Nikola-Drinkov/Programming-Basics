package CondStatements_Advanced_Exercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        String place = sc.nextLine();
        String feedback = sc.nextLine();

        int nights = days-1;
        double price = 0;

        switch(place){
            case"room for one person":
                price = 18.00*nights;
                break;
            case"apartment":
                price = 25.00*nights;
                if(nights<10){
                    price-=price*0.3;
                }
                else if(nights>=10&&nights<=15){
                    price-=price*0.35;
                }
                else{
                    price-=price*0.5;
                }
                break;
            case"president apartment":
                price=35.00*nights;
                if(nights<10){
                    price-=price*0.1;
                }
                else if(nights>=10&&nights<=15){
                    price-=price*0.15;
                }
                else{
                    price-=price*0.2;
                }
                break;
        }
        switch (feedback){
            case"positive":
                price+=price*0.25;
                break;
            case"negative":
                price-=price*0.10;
                break;
        }
        System.out.printf("%.2f",price);
    }
}
