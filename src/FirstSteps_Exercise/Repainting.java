package FirstSteps_Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countNailon = Integer.parseInt(sc.nextLine());
        int countBoq = Integer.parseInt(sc.nextLine());
        int countRazreditel = Integer.parseInt(sc.nextLine());
        int chasove = Integer.parseInt(sc.nextLine());

        double sumNailon = (countNailon+2)*1.50;
        double sumBoq = countBoq*14.50;
        sumBoq = sumBoq + 0.1*sumBoq;
        double sumRazreditel = countRazreditel*5.00;
        double sumTorbichki = 0.40;
        double sumMatrial = sumNailon+sumBoq+sumRazreditel+sumTorbichki;
        double sumMaistori = (0.3*sumMatrial)*(double)chasove;
        double sum = sumMatrial+sumMaistori;
        System.out.println(sum);
    }
}
