package FirstSteps_Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countChicken = Integer.parseInt(sc.nextLine());
        int countFish = Integer.parseInt(sc.nextLine());
        int countVeg = Integer.parseInt(sc.nextLine());

        double sumChicken = countChicken*10.35;
        double sumFish = countFish*12.40;
        double sumVeg = countVeg*8.15;
        double sum = sumFish+sumVeg+sumChicken;
        double desert = 0.2*sum;
        sum = sum+desert+2.50;
        System.out.println(sum);

    }
}
