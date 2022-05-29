package ForLoops_Exercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<n; i++){
            int currentNum = Integer.parseInt(sc.nextLine());
            if(currentNum>max){
                max=currentNum;
            }
            sum+=currentNum;
        }
        sum=sum-max;
        if(sum==max){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        }
        else{
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(sum-max));
        }
    }
}
