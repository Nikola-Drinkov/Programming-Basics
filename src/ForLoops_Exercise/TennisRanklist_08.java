package ForLoops_Exercise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tournaments = Integer.parseInt(sc.nextLine());
        int startingPoints = Integer.parseInt(sc.nextLine());
        int totalPoints = startingPoints;
        int wins = 0;
        for(int i=0; i<tournaments; i++){
            String stage = sc.nextLine();
            switch (stage){
                case "W":
                    totalPoints+=2000;
                    wins++;
                    break;
                case"F":
                    totalPoints+=1200;
                    break;
                case"SF":
                    totalPoints+=720;
                    break;
            }
        }
        double averagePoints = (totalPoints-startingPoints)/tournaments;
        double winrate = (double)wins/tournaments*100;
        System.out.printf("Final points: %d%n",totalPoints);
        System.out.printf("Average points: %.0f%n",Math.floor(averagePoints));
        System.out.printf("%.2f%%",winrate);
    }
}
