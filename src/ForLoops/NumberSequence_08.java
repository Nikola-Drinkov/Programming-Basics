package ForLoops;

import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i=1; i<=n; i++){
            int currentNum = Integer.parseInt(sc.nextLine());
            if(currentNum>max){
                max=currentNum;
            }
            if(currentNum<min){
                min=currentNum;
            }
        }
        System.out.printf("Max number: %d%n",max);
        System.out.printf("Min number: %d",min);
    }
}
