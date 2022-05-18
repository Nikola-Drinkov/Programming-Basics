package ConditionalStatements_Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double worldRecord = Double.parseDouble(sc.nextLine());
        double distance = Double.parseDouble(sc.nextLine());
        double timeForMeter = Double.parseDouble(sc.nextLine());
        double slowing = Math.floor(distance/15);
        slowing = slowing*12.5;

        double timeIvan = distance*timeForMeter+slowing;
        double remaining = timeIvan-worldRecord;

        if(worldRecord>timeIvan) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",timeIvan);
        }
        else
            System.out.printf("No, he failed! He was %.2f seconds slower.", remaining);
    }
}
