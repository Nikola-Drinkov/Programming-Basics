package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Time15Minutes03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hourInput = Integer.parseInt(sc.nextLine());
        int minutesInput = Integer.parseInt(sc.nextLine());
        int totalMinutes = hourInput*60+minutesInput+15;
        int hour = totalMinutes/60;
        int minutes = totalMinutes%60;
        if(hour==24){
            hour=0;
        }
        System.out.printf("%d:%02d",hour,minutes);

    }
}
