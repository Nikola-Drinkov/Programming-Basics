package WhileLoop;

import java.util.Scanner;

public class Sequence2k_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int currentNum=1;
        while (currentNum<=n){
            System.out.println(currentNum);
            currentNum=currentNum*2+1;
        }
    }
}
