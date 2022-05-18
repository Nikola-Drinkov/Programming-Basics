package FirstSteps_Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax = Integer.parseInt(sc.nextLine());
        double priceKecove = tax-0.4*tax;
        double priceEkip = priceKecove-0.2*priceKecove;
        double priceTopka = priceEkip/4;
        double priceAksesoari = priceTopka/5;
        double sum = tax+priceKecove+priceEkip+priceTopka+priceAksesoari;
        System.out.println(sum);
    }
}
