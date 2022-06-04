package WhileLoop;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int min  = Integer.MAX_VALUE;
        while (!input.equals("Stop")){
            int currentNum  = Integer.parseInt(input);
            if(currentNum<min){
                min = currentNum;
            }
            input = sc.nextLine();
        }
        System.out.println(min);
    }
}
