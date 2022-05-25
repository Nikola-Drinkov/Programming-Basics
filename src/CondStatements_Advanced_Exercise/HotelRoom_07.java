package CondStatements_Advanced_Exercise;

import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();
        int nights = Integer.parseInt(sc.nextLine());
        double priceApartment=0;
        double priceStudio=0;

        if(month.equals("May")||month.equals("October")){
            priceStudio=50;
            priceApartment=65;
            if(nights>7&&nights<=14){
                priceStudio-=priceStudio*0.05;
            }
            else if(nights>14){
                priceStudio-=priceStudio*0.3;
                priceApartment-=priceApartment*0.1;
            }
        }
        else if(month.equals("June")||month.equals("September")){
            priceStudio=75.20;
            priceApartment=68.70;
            if(nights>14){
                priceStudio-=priceStudio*0.2;
                priceApartment-=priceApartment*0.1;
            }
        }
        else if(month.equals("July")||month.equals("August")){
            priceStudio=76;
            priceApartment=77;
            if(nights>14){
                priceApartment-=priceApartment*0.1;
            }
        }
        double totalApartment = priceApartment*nights;
        double totalStudio = priceStudio*nights;
        System.out.printf("Apartment: %.2f lv.%n",totalApartment);
        System.out.printf("Studio: %.2f lv.",totalStudio);

    }
}
