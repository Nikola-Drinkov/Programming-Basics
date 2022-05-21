package CondStatements_Advanced;

import java.util.Scanner;

public class WorkingHours_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = Integer.parseInt(sc.nextLine());
        String day = sc.nextLine();

        if(!day.equals("Sunday")){
            if(hour>=10&&hour<19){
                System.out.println("open");
            }
            else{
                System.out.println("closed");
            }
        }
        else System.out.println("closed");
    }
}
