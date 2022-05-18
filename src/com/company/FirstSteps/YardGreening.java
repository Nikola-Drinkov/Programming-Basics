package com.company.FirstSteps;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Float.parseFloat(sc.nextLine());
        double sum = n*7.61;
        double discount = sum*0.18;
        sum = sum-discount;
        System.out.println("The final price is: "+sum+" lv.");
        System.out.println("The discount is: "+discount+" lv.");
    }
}
