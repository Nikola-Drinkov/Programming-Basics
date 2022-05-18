package ConditionalStatements_Exercise;

import java.util.Scanner;

public class SumSeconds_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int timeFirst = Integer.parseInt(sc.nextLine());
        int timeSecond = Integer.parseInt(sc.nextLine());
        int timeThird = Integer.parseInt(sc.nextLine());
        int totalTime = timeFirst+timeSecond+timeThird;
        int mins = totalTime/60;
        int secs = totalTime%60;
        if(secs<10){
            System.out.printf("%d:0%d",mins,secs);
        }
        else{
            System.out.printf("%d:%d",mins,secs);
        }


    }
}
