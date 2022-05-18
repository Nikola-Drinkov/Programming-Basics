package FirstSteps_Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = Double.parseDouble(sc.nextLine());
        int srok = Integer.parseInt(sc.nextLine());
        double procent = Double.parseDouble(sc.nextLine());
        double lihva = srok*(sum*procent/100/12);
        System.out.print(sum+lihva);
    }
}
