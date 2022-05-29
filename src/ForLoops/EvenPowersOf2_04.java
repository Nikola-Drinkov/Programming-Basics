package ForLoops;

import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<=n;i++){
            if(i%2==0){
                System.out.printf("%.0f%n",Math.pow(2,i));
            }
        }
    }
}
