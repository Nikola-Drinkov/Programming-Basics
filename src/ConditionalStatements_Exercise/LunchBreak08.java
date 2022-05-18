package ConditionalStatements_Exercise;

import java.util.Scanner;

public class LunchBreak08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Series = sc.nextLine();
        int epDuration = Integer.parseInt(sc.nextLine());
        int breakTime = Integer.parseInt(sc.nextLine());

        double lunchTime = breakTime/8.0;
        double restTime = breakTime/4.0;

        double availableTime = breakTime-lunchTime-restTime;
        Math.ceil(availableTime);

        double difference = Math.abs(availableTime - epDuration);

        if(availableTime>=epDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",Series,Math.ceil(difference));
        }
        else
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",Series,Math.ceil(difference));
    }
}
