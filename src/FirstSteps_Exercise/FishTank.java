package FirstSteps_Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double procent = Double.parseDouble(sc.nextLine())/100.00;
        double capacity = (double)(length*height*width)/1000;
        double litres = capacity*(1.00-procent);
        System.out.println(litres);
    }
}
