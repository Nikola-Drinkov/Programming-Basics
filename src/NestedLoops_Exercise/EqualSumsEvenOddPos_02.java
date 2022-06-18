package NestedLoops_Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPos_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int firstNum = Integer.parseInt(sc.nextLine());
       int secondNum = Integer.parseInt(sc.nextLine());

       for(int i=firstNum; i<=secondNum; i++){
           int currentNum=i;
           int evenSum=0;
           int oddSum=0;
           for(int j=6; j>=1; j--){
               int digit = currentNum%10;
               if(j%2==0){
                   evenSum+=digit;
               }
               else{
                   oddSum+=digit;
               }
               currentNum=currentNum/10;
           }
           if(oddSum==evenSum){
               System.out.print(i+" ");
           }
       }
    }
}
