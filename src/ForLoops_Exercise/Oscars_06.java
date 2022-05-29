package ForLoops_Exercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String actorName = sc.nextLine();
        double pointsFromAcademy = Double.parseDouble(sc.nextLine());
        int countAssessors = Integer.parseInt(sc.nextLine());
        double totalPoints=pointsFromAcademy;

        for(int i=0; i<countAssessors; i++){
            String currentAssessor = sc.nextLine();
            double pointsFromAssessor = Double.parseDouble(sc.nextLine());
            pointsFromAssessor = (pointsFromAssessor*currentAssessor.length())/2;
            totalPoints+=pointsFromAssessor;

            if(totalPoints>1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",actorName,totalPoints);
                break;
            }
        }
        if(totalPoints<1250.5) {
            double shortage = 1250.5 - totalPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actorName, shortage);
        }
    }
}
