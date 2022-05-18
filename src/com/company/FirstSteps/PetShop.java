package com.company.FirstSteps;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int br1 = Integer.parseInt(sc.nextLine());
        int br2 = Integer.parseInt(sc.nextLine());
        double sum = br1*2.50+br2*4;
        System.out.print(sum+" lv.");

    }
}
