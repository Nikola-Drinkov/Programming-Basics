package FirstSteps_Exercise;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = Double.parseDouble(sc.nextLine());
        double gra = rad*180/Math.PI;
        System.out.println(gra);
    }
}
