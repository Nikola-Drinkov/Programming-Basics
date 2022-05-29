package ForLoops_Exercise;

import java.util.Scanner;

public class NumbersEndingIn7_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<1000; i++){
            if(i%10==7){
                System.out.println(i);
            }
        }
    }
}
