package ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String figure = sc.nextLine();
        if(figure.equals("square")){
            double a = Double.parseDouble(sc.nextLine());
            double result = a*a;
            System.out.printf("%.3f",result);
        }
        else if(figure.equals("rectangle")){
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            double result = a*b;
            System.out.printf("%.3f",result);
        }
        else if(figure.equals("triangle")){
            double a = Double.parseDouble(sc.nextLine());
            double ha = Double.parseDouble(sc.nextLine());
            double result = (a*ha/2);
            System.out.printf("%.3f",result);
        }
        else if(figure.equals("circle")){
            double r = Double.parseDouble(sc.nextLine());
            double result = r*r*Math.PI;
            System.out.printf("%.3f",result);
        }
    }
}
