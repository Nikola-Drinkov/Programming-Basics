package WhileLoop_Exercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int goal = 10000;
        int totalSteps = 0;
        while(totalSteps<=goal){
            String input = sc.nextLine();
            if(input.equals("Going home")){
                int stepsToHome = Integer.parseInt(sc.nextLine());
                totalSteps+=stepsToHome;
                break;
            }
            int steps = Integer.parseInt(input);
            totalSteps+=steps;

        }
        if(totalSteps>goal) {
            int more = totalSteps - goal;
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", more);
        }
        else{
            int needed = goal-totalSteps;
            System.out.printf("%d more steps to reach goal.",needed);
        }
    }
}
