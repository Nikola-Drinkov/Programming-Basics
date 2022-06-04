package ForLoop_More;

import java.util.Scanner;

public class BackToThePast_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double legacy = Double.parseDouble(sc.nextLine());
        int year = Integer.parseInt(sc.nextLine());
        int ivanchoYears = 18;
        int sum = 0;
        for(int i=1800; i<=year; i++){
            if(i%2==0){
                sum+=12000;
                ivanchoYears++;
            }
            else{
                sum+=12000+50*ivanchoYears;
                ivanchoYears++;
            }
        }
        if(legacy>=sum){
            double excess = legacy-sum;
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",excess);
        }
        else{
            double needed = sum-legacy;
            System.out.printf("He will need %.2f dollars to survive.",needed);
        }
    }
}
