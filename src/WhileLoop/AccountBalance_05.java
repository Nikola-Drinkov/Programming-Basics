package WhileLoop;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        double sum = 0;
        while(!input.equals("NoMoreMoney")){
            double currentSum = Double.parseDouble(input);
            if(currentSum<0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n",currentSum);
            sum+=currentSum;
            input = sc.nextLine();
        }
        System.out.printf("Total: %.2f",sum);
    }
}
