package WhileLoop_Exercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxPoorGrades = Integer.parseInt(sc.nextLine());
        int countProblems = 0;
        int countPoorGrades = 0;
        int sumGrades = 0;
        boolean fail = false;
        String lastExercise  = "";

        String input = sc.nextLine();
        while(!input.equals("Enough")){
            countProblems++;
            lastExercise = input;
            int exerciseGrade = Integer.parseInt(sc.nextLine());
            if(exerciseGrade<=4){
                countPoorGrades++;
            }
            if(countPoorGrades==maxPoorGrades){
                fail = true;
                break;
            }
            sumGrades+=exerciseGrade;
            input = sc.nextLine();
        }
        double average = (double)sumGrades/countProblems;
        if(fail){
            System.out.printf("You need a break, %d poor grades.",maxPoorGrades);
        }
        else{
            System.out.printf("Average score: %.2f%n",average);
            System.out.printf("Number of problems: %d%n",countProblems);
            System.out.printf("Last problem: %s",lastExercise);
        }
    }
}
