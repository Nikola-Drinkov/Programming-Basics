package WhileLoop_More;

import java.util.Scanner;

public class AverageNumber_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double sum = 0;
        double count = 0;
        for(int i=1; i<=n; i++){
            count++;
            int currentNum = Integer.parseInt(sc.nextLine());
            sum+=currentNum;
        }
        double average = sum/count;
        System.out.printf("%.2f",average);
    }
}
