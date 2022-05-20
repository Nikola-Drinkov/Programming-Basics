package ConditionalStatements_More;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double priceMagnolia = 3.25;
        double priceHyacinth = 4.00;
        double priceRose = 3.50;
        double priceCactus = 8.00;

        int countMagnolia = Integer.parseInt(sc.nextLine());
        int countHyacinth = Integer.parseInt(sc.nextLine());
        int countRose = Integer.parseInt(sc.nextLine());
        int countCactus = Integer.parseInt(sc.nextLine());
        double priceGift = Double.parseDouble(sc.nextLine());

        double profit = priceMagnolia*countMagnolia+priceHyacinth*countHyacinth+priceRose*countRose+priceCactus*countCactus;
        profit-=profit*0.05;
        if(profit>=priceGift){
            double excess = profit-priceGift;
            System.out.printf("She is left with %.0f leva.",Math.floor(excess));
        }
        else{
            double shortage = priceGift-profit;
            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(shortage));
        }

    }
}
