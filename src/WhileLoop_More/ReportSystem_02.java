package WhileLoop_More;

import java.util.Scanner;

public class ReportSystem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countTransactions = 0;
        int cashTransactions=0;
        int cardTransactions=0;
        int totalInCash=0;
        int totalWithCard=0;
        int totalSum=0;

        int sumRequired = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        while (!input.equals("End")){
            countTransactions++;
            int currentSum = Integer.parseInt(input);
            if(countTransactions%2!=0){
                if(currentSum>100){
                    System.out.println("Error in transaction!");
                }
                else{
                    System.out.println("Product sold!");
                    cashTransactions++;
                    totalInCash+=currentSum;
                    totalSum+=currentSum;
                }
            }
            else{
                if(currentSum<10){
                    System.out.println("Error in transaction!");
                }
                else{
                    System.out.println("Product sold!");
                    cardTransactions++;
                    totalWithCard+=currentSum;
                    totalSum+=currentSum;
                }
            }
            if(totalSum>sumRequired){
                break;
            }
            input = sc.nextLine();
        }
        if(totalSum>=sumRequired) {
            double averageCash = (double) totalInCash / cashTransactions;
            double averageCard = (double) totalWithCard / cardTransactions;

            System.out.printf("Average CS: %.2f%n", averageCash);
            System.out.printf("Average CC: %.2f", averageCard);
        }
        else System.out.print("Failed to collect required money for charity.");
    }
}
