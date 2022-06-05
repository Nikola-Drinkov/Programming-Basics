package WhileLoop_Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double neededMoney = Double.parseDouble(sc.nextLine());
        double availableMoney = Double.parseDouble(sc.nextLine());
        int days = 0;
        int countConsecutiveSpending=0;
        boolean moneyAreSaved = false;

        while(true){
            days++;
            String action = sc.nextLine();
            double sumForAction = Double.parseDouble(sc.nextLine());
            switch (action){
                case"spend":
                    countConsecutiveSpending++;
                    availableMoney-=sumForAction;
                    if(availableMoney<0){
                        availableMoney=0;
                    }
                    break;
                case"save":
                    countConsecutiveSpending=0;
                    availableMoney+=sumForAction;
                    break;
            }
            if(availableMoney>=neededMoney){
                moneyAreSaved = true;
                break;
            }
            else if(countConsecutiveSpending==5){
                break;
            }
        }
        if(moneyAreSaved) {
            System.out.printf("You saved the money for %d days.", days);
        }
        else{
            System.out.println("You can't save the money.");
            System.out.printf("%d",days);
        }
    }
}
