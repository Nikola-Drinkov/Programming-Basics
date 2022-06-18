package NestedLoops_Exercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int countTotalTickets = 0;
        int countStudent=0;
        int countStandard=0;
        int countKid=0;

        while (!input.equals("Finish")){
            String movie = input;
            int freeSeats = Integer.parseInt(sc.nextLine());

            String ticketType = sc.nextLine();
            int countCurrentTickets = 0;
            while (!ticketType.equals("End")){
               countCurrentTickets++;
               countTotalTickets++;
               switch (ticketType){
                   case"student":
                       countStudent++;
                       break;
                   case"standard":
                       countStandard++;
                       break;
                   case"kid":
                       countKid++;
                       break;
               }

                if(countCurrentTickets>=freeSeats){
                    break;
                }
                ticketType = sc.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n",movie,(double)countCurrentTickets/freeSeats*100);
            input = sc.nextLine();
        }
        System.out.printf("Total tickets: %d%n",countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n",(double)countStudent/countTotalTickets*100);
        System.out.printf("%.2f%% standard tickets.%n",(double)countStandard/countTotalTickets*100);
        System.out.printf("%.2f%% kids tickets.",(double)countKid/countTotalTickets*100);

    }
}
