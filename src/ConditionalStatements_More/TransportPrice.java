package ConditionalStatements_More;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String time = sc.nextLine();
        double price = 0;

        if(n<20){
            if(time.equals("day")){
                price = n*0.79+0.70;
            }
            if(time.equals("night")){
                price =  n*0.90+0.70;
            }
        }
        else if(n<100){
            price = 0.09*n;
        }
        else {
            price = n * 0.06;
        }
        System.out.printf("%.2f",price);
    }
}
