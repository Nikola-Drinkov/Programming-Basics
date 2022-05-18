package ConditionalStatements;

import java.util.Scanner;

public class EvenOrOdd03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        if(n%2==0){
            System.out.println("even");
        }
        else
            System.out.println("odd");
    }
}
