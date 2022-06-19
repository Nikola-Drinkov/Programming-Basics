package MockExam2020;

import java.util.Scanner;

public class EasterCompetition_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countBreads = Integer.parseInt(sc.nextLine());

        int highestPoints = 0;
        String champName = "";
        int champScore = 0;

        for(int i=countBreads; i>=1; i--){
            boolean newWinner = false;
            int totalPoints=0;
            String contestant = sc.nextLine();
            String input = sc.nextLine();

            while(!input.equals("Stop")){
                int currentPoints = Integer.parseInt(input);
                totalPoints+=currentPoints;
                input = sc.nextLine();
            }
            if(totalPoints>highestPoints){
                highestPoints=totalPoints;
                newWinner=true;
            }
            System.out.printf("%s has %d points.%n",contestant, totalPoints);
            if(newWinner){
                champName=contestant;
                champScore=totalPoints;
                System.out.printf("%s is the new number 1!%n",contestant);
            }
        }
        System.out.printf("%s won competition with %d points!",champName,champScore);
    }
}
