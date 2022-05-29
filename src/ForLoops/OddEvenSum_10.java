package ForLoops;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sumOdd=0;
        int sumEven=0;
        for(int i =0; i<n; i++){
            int currentNum = Integer.parseInt(sc.nextLine());
            if(i%2==0){
                sumEven+=currentNum;
            }
            else{
                sumOdd+=currentNum;
            }
        }
        if(sumEven==sumOdd){
            System.out.println("Yes");
            System.out.printf("Sum = %d",sumEven);
        }
        else{
            System.out.println("No");
            int diff = Math.abs(sumEven-sumOdd);
            System.out.printf("Diff = %d",diff);
        }
    }
}
