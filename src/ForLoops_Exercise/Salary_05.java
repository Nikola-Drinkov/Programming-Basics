package ForLoops_Exercise;

import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());
        int fine = 0;

        for(int i=0; i<n; i++){
            String currentTab = sc.nextLine();
            switch (currentTab){
                case"Facebook":
                    fine+=150;
                    break;
                case"Instagram":
                    fine+=100;
                    break;
                case"Reddit":
                    fine+=50;
                    break;
            }
            if(fine>=salary){
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if(salary>fine) {
            int moneyLeft = salary - fine;
            System.out.println(moneyLeft);
        }
    }
}
