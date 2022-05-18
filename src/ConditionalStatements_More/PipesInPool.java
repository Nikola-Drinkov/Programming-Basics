package ConditionalStatements_More;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = Integer.parseInt(sc.nextLine());
        int p1 = Integer.parseInt(sc.nextLine());
        int p2 = Integer.parseInt(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());

        double litres1 = p1*h;
        double litres2  = p2*h;
        double totalLitres = litres1+litres2;

        double percentage1 = litres1/totalLitres*100;
        double percentage2 = litres2/totalLitres*100;
        double totalPercentage = totalLitres/v*100;

        if(totalLitres<=v){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",totalPercentage,percentage1,percentage2);
        }
        else {
            double overflow = totalLitres - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f litres.",h,overflow);
        }
    }
}
