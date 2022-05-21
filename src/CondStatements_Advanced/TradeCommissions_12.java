package CondStatements_Advanced;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        double sales = Double.parseDouble(sc.nextLine());
        double commission = 0;
        boolean isValid = true;

        if (city.equals("Sofia")) {
            if (0 <= sales && sales <= 500) {
                commission = sales * 0.05;
            } else if (500 < sales && sales <= 1000) {
                commission = sales * 0.07;
            } else if (1000 < sales && sales <= 10000) {
                commission = sales * 0.08;
            } else if (sales > 10000) {
                commission = sales * 0.12;
            } else isValid = false;
        } else if (city.equals("Varna")) {
            if (0 <= sales && sales <= 500) {
                commission = sales * 0.045;
            } else if (500 < sales && sales <= 1000) {
                commission = sales * 0.075;
            } else if (1000 < sales && sales <= 10000) {
                commission = sales * 0.10;
            } else if (sales > 10000) {
                commission = sales * 0.13;
            } else isValid = false;
        } else if (city.equals("Plovdiv")) {
            if (0 <= sales && sales <= 500) {
                commission = sales * 0.055;
            } else if (500 < sales && sales <= 1000) {
                commission = sales * 0.08;
            } else if (1000 < sales && sales <= 10000) {
                commission = sales * 0.12;
            } else if (sales > 10000) {
                commission = sales * 0.145;
            } else isValid = false;
        }
        else isValid = false;

        if(isValid){
            System.out.printf("%.2f", commission);
        }
        else{
            System.out.println("error");
        }
    }
}
