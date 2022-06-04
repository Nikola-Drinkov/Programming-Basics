import java.util.Scanner;

public class SumNumbers_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int sum =0;
        while (sum<n){
            int currentNum = Integer.parseInt(sc.nextLine());
            sum+=currentNum;
        }
        System.out.println(sum);
    }
}
