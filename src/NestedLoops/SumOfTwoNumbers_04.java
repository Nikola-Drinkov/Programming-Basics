package NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        int sum=0;
        int countCombinations=0;

        for(int i=start; i<=end; i++){
            for(int j=start; j<=end; j++){
                countCombinations++;
               sum=i+j;
               if(sum==n){
                   System.out.printf("Combination N:%d (%d + %d = %d)",countCombinations,i,j,n);
                   break;
               }
            }
            if(sum==n){
                break;
            }
        }
        if(sum!=n) {
            System.out.printf("%d combinations - neither equals %d", countCombinations, n);
        }
    }
}
