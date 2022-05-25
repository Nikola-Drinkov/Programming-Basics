package CondStatements_Advanced_Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        double result;
        String EvenOdd;

        switch (operator){
            case "+":
                result = n1+n2;
                if(result%2==0){
                    EvenOdd="even";
                }
                else{
                    EvenOdd="odd";
                }
                System.out.printf("%d + %d = %.0f - %s",n1,n2,result,EvenOdd);
                break;

            case "-":
                result = n1-n2;
                if(result%2==0){
                    EvenOdd="even";
                }
                else{
                    EvenOdd="odd";
                }
                System.out.printf("%d - %d = %.0f - %s",n1,n2,result,EvenOdd);
                break;

            case "*":
                result = n1*n2;
                if(result%2==0){
                    EvenOdd="even";
                }
                else{
                    EvenOdd="odd";
                }
                System.out.printf("%d * %d = %.0f - %s",n1,n2,result,EvenOdd);
                break;

            case "/":
                if(n2==0){
                    System.out.printf("Cannot divide %d by zero",n1);
                }
                else{
                    result=(double)n1/n2;
                    System.out.printf("%d / %d = %.2f",n1,n2,result);
                }
                break;
            case "%":
                if(n2==0){
                    System.out.printf("Cannot divide %d by zero",n1);
                }
                else{
                    result=n1%n2;
                    System.out.printf("%d %% %d = %.0f",n1,n2,result);
                }
                break;
        }

    }
}
