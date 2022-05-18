package com.company.FirstSteps;

import java.util.Scanner;

public class СъздаванеНаПроекти{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int br = Integer.parseInt(sc.nextLine());
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name,br*3,br);
    }
}
