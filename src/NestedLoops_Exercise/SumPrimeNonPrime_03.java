package NestedLoops_Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int sumPrime=0;
        int sumNon=0;
        String input = sc.nextLine();
        while(!input.equals("stop")){
            int count=0;
            int currentNum = Integer.parseInt(input);
            if(currentNum<0){
                System.out.printf("Number is negative.%n");
                input=sc.nextLine();
                continue;
            }
            for(int i=1; i<=currentNum;i++){
             if(currentNum%i==0){
                 count++;
             }
            }
            if(count==2){
                sumPrime+=currentNum;
            }
            else{
                sumNon+=currentNum;
            }
            input = sc.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d",sumNon);
    }
}
