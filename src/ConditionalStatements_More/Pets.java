package ConditionalStatements_More;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        int foodAvailable = Integer.parseInt(sc.nextLine());
        double dogFood = Double.parseDouble(sc.nextLine());
        double catFood = Double.parseDouble(sc.nextLine());
        double turtleFood = Double.parseDouble(sc.nextLine());
        turtleFood = turtleFood/1000;

        double foodRequired = days*(dogFood+catFood+turtleFood);
        if(foodRequired<foodAvailable){
            double excessiveFood = foodAvailable-foodRequired;
            System.out.printf("%.0f kilos of food left.",Math.floor(excessiveFood));
        }
        else {
            double shortageFood = foodRequired-foodAvailable;
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(shortageFood));
        }


    }
}
