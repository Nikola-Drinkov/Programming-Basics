package ForLoops;

import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for(int i=0; i<n; i++){
            int currentNum = Integer.parseInt(sc.nextLine());
            sum+=currentNum;
        }
        System.out.println(sum);
    }
}
