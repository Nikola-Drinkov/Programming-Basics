package ConditionalStatements_More;

import java.util.Locale;
import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fuelType = sc.nextLine();
        int fuelInTank = Integer.parseInt(sc.nextLine());

        if(fuelType.equals("Gasoline")||fuelType.equals("Gas")||fuelType.equals("Diesel")) {
            if (fuelInTank >= 25) {
                System.out.printf("You have enough %s.", fuelType.toLowerCase());
            } else {
                System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
            }
        }
        else
            System.out.println("Invalid fuel!");
    }
}
