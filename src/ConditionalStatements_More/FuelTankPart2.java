package ConditionalStatements_More;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priceGasoline = 2.22;
        double priceDiesel = 2.33;
        double priceGas = 0.93;

        String fuelType = sc.nextLine();
        double fuelQuantity = Integer.parseInt(sc.nextLine());
        String discountCard = sc.nextLine();
        double totalPrice;

        if(fuelType.equals("Gas")){
            if(discountCard.equals("Yes")){
                totalPrice=(priceGas-0.08)*fuelQuantity;
            }
            else{
                totalPrice=priceGas*fuelQuantity;
            }
            if(fuelQuantity>25){
                totalPrice-=totalPrice*0.10;
            }
            else if (fuelQuantity>=20&&fuelQuantity<25){
                totalPrice-=totalPrice*0.08;
            }
            System.out.printf("%.2f lv.",totalPrice);
        }

        if(fuelType.equals("Gasoline")){
            if(discountCard.equals("Yes")){
                totalPrice=(priceGasoline-0.18)*fuelQuantity;
            }
            else{
                totalPrice=priceGasoline*fuelQuantity;
            }
            if(fuelQuantity>25){
                totalPrice-=totalPrice*0.10;
            }
            else if (fuelQuantity>=20&&fuelQuantity<25){
                totalPrice-=totalPrice*0.08;
            }
            System.out.printf("%.2f lv.",totalPrice);
        }

        if(fuelType.equals("Diesel")){
            if(discountCard.equals("Yes")){
                totalPrice=(priceDiesel-0.12)*fuelQuantity;
            }
            else{
                totalPrice=priceDiesel*fuelQuantity;
            }
            if(fuelQuantity>25){
                totalPrice-=totalPrice*0.10;
            }
            else if (fuelQuantity>=20&&fuelQuantity<25){
                totalPrice-=totalPrice*0.08;
            }
            System.out.printf("%.2f lv.",totalPrice);
        }
    }
}
