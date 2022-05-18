package ConditionalStatements_More;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int freeDays = Integer.parseInt(sc.nextLine());
        int workDays = 365-freeDays;
        int playTime = freeDays*127+workDays*63;

        int differenceMins = Math.abs(30000-playTime);
        int hours = differenceMins/60;
        int mins = differenceMins%60;

        if(playTime>30000){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, mins);
        }
        else{
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, mins);
        }
    }
}
