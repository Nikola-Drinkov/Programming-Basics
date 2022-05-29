package ForLoops_Exercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());
        double priceWashingMachine = Double.parseDouble(sc.nextLine());
        int priceToy = Integer.parseInt(sc.nextLine());

        int evenBirthdays = 0;
        int oddBirthdays = 0;
        int money=0;
        double totalMoney=0;
        int brother=0;
        for(int i=1; i<=age; i++){
            if(i%2==0){
                evenBirthdays++;
                brother++;
                money+=10;
                totalMoney+=money;
            }
            else{
                oddBirthdays++;
            }
        }
        totalMoney-=brother;
        totalMoney+=oddBirthdays*priceToy;

        if(priceWashingMachine<=totalMoney){
            double excess = totalMoney-priceWashingMachine;
            System.out.printf("Yes! %.2f",excess);
        }
        else{
            double shortage = priceWashingMachine-totalMoney;
            System.out.printf("No! %.2f",shortage);
        }
    }
}
