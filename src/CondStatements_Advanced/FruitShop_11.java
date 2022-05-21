package CondStatements_Advanced;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double price = 0;
        boolean isWeekend = false;
        boolean isWeekday = false;
        boolean isValid=true;
        if (day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday")) {
            isWeekday = true;
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            isWeekend = true;
        }
        if (isWeekday) {
            if (fruit.equals("banana")) {
                price = 2.50;
            }
            else if (fruit.equals("apple")) {
                price = 1.20;
            }
            else if (fruit.equals("orange")) {
                price = 0.85;
            }
            else if (fruit.equals("grapefruit")) {
                price = 1.45;
            }
            else if (fruit.equals("kiwi")) {
                price = 2.70;
            }
            else if (fruit.equals("pineapple")) {
                price = 5.50;
            }
            else if (fruit.equals("grapes")) {
                price = 3.85;
            }
            else isValid=false;
        }
        else if(isWeekend){
            if (fruit.equals("banana")) {
                price = 2.70;
            }
            else if (fruit.equals("apple")) {
                price = 1.25;
            }
            else if (fruit.equals("orange")) {
                price = 0.90;
            }
            else if (fruit.equals("grapefruit")) {
                price = 1.60;
            }
            else if (fruit.equals("kiwi")) {
                price = 3.00;
            }
            else if (fruit.equals("pineapple")) {
                price = 5.60;
            }
            else if (fruit.equals("grapes")) {
                price = 4.20;
            }
            else isValid=false;
        }
        else isValid=false;

        if(isValid){
            double totalPrice = price*quantity;
            System.out.printf("%.2f",totalPrice);
        }
        else{
            System.out.println("error");
        }
    }
}
