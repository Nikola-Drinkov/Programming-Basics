package NestedLoops_Exercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jury = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        double totalScore=0;
        int presentationCount=0;

        while (!input.equals("Finish")){
            presentationCount++;
            double sumGrade=0;
            String presentation = input;
            for(int i=1; i<=jury; i++){
                double grade = Double.parseDouble(sc.nextLine());
                sumGrade+=grade;
                totalScore+=grade;
            }
            double averageGrade = sumGrade/jury;
            System.out.printf("%s - %.2f.%n",presentation,averageGrade);
            input = sc.nextLine();
        }
        double totalAverageGrade = totalScore/(jury*presentationCount);
        System.out.printf("Student's final assessment is %.2f.",totalAverageGrade);
    }
}
