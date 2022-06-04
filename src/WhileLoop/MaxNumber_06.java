package WhileLoop;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int max = Integer.MIN_VALUE;
        while(!input.equals("Stop")){
            int currentNumber = Integer.parseInt(input);
            if(currentNumber>max){
                max=currentNumber;
            }
            input = sc.nextLine();
        }
        System.out.println(max);
    }
}
