package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Shopping07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        //GPU
        int n = Integer.parseInt(sc.nextLine());
        //CPU
        int m = Integer.parseInt(sc.nextLine());
        //RAM
        int p = Integer.parseInt(sc.nextLine());

        double priceGPU = 250.00*n;
        double priceCPU = 0.35*priceGPU*m;
        double priceRAM = 0.10*priceGPU*p;
        double priceTotal = priceCPU+priceGPU+priceRAM;
        if(n>m) {
            priceTotal = priceTotal-0.15*priceTotal;
        }
        double remaining = priceTotal-budget;
        double extra = budget-priceTotal;

        if(priceTotal<budget) {
            System.out.printf("You have %.02f leva left!", extra);
        }
        else System.out.printf("Not enough money! You need %.02f leva more!", remaining);
    }
}
