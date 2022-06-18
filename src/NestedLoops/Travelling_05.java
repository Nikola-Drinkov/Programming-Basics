package NestedLoops;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String input = sc.nextLine();
        while (!input.equals("End")){
            String destination = input;
            double minBudget = Double.parseDouble(sc.nextLine());

            double savedSum=0;
            while(savedSum<minBudget){
                double currentSum = Double.parseDouble(sc.nextLine());
                savedSum+=currentSum;
            }
            System.out.printf("Going to %s!%n",destination);

            input = sc.nextLine();
        }
    }
}
