package FirstSteps_Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countPens = Integer.parseInt(sc.nextLine());
        int countMarker = Integer.parseInt(sc.nextLine());
        int litres = Integer.parseInt(sc.nextLine());
        int procent = Integer.parseInt(sc.nextLine());
        double sum = countPens*5.80+countMarker*7.20+litres*1.20;
        double discount  = ((double)procent/100)*sum;
        double sum1 = sum-discount;
        System.out.println(sum1);
    }
}
