package ConditionalStatements_More;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int areaField = Integer.parseInt(sc.nextLine());
        double grapes1sqm = Double.parseDouble(sc.nextLine());
        int requiredWine = Integer.parseInt(sc.nextLine());
        int workers = Integer.parseInt(sc.nextLine());

        double producedGrapes = areaField*grapes1sqm;
        double producedWine = (40.00/100.00*producedGrapes)/2.5;
        double excessiveWine = producedWine-requiredWine;
        double winePerPerson = excessiveWine/workers;

        if(producedWine>=requiredWine){
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(producedWine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.floor(excessiveWine), Math.floor(winePerPerson));
        }
        else{
            double shortage = requiredWine-producedWine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(shortage));
        }
    }
}
