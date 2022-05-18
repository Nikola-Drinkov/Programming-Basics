package com.company.FirstSteps;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double cm = Double.parseDouble(sc.nextLine());
        double inch = cm*2.54;
        System.out.println(inch);
    }
}
