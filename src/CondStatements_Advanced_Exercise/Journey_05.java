package CondStatements_Advanced_Exercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String destination = "";
        String type;
        if(season.equals("summer")){
            type = "Camp";
        }
        else{
            type = "Hotel";
        }

        if(budget<=100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                budget = budget * 0.30;
            } else if (season.equals("winter")) {
                budget = budget * 0.70;
            }
        }
            else if(budget>100&&budget<=1000){
                destination = "Balkans";
                if(season.equals("summer")){
                    budget = budget*0.40;
                }
                else if(season.equals("winter")){
                    budget = budget*0.80;
                }
            }
            else{
                destination="Europe";
                type = "Hotel";
                budget = budget*0.90;
            }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", type, budget);
    }
}
