package ForLoops;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int leftSum=0;
        int rightSum=0;

        for(int i=0;i<n;i++){
            int currentNum=Integer.parseInt(sc.nextLine());
            leftSum+=currentNum;
        }
        for(int i=0; i<n; i++){
            int currentNum=Integer.parseInt(sc.nextLine());
            rightSum+=currentNum;
        }
        if(rightSum==leftSum){
            System.out.printf("Yes, sum = %d",leftSum);
        }
        else{
            int diff = Math.abs(rightSum-leftSum);
            System.out.printf("No, diff = %d",diff);
        }

    }
}
