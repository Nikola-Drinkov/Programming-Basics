package NestedLoops_Exercise;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int number = 1;
        for(int rows=1; rows<=n; rows++){
            for (int cols = 1; cols<=rows; cols++){
                if(number>n){
                    break;
                }
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

    }
}
