package WhileLoop_More;

import java.util.Scanner;

public class Dishwasher_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bottles = Integer.parseInt(sc.nextLine());
        int availableDetergent = bottles*750;

        String input = sc.nextLine();
        int countLoadings = 0;
        int totalDishes = 0;
        int totalPots = 0;
        int totalDetergentUsed = 0;

        while(!input.equals("End")){
            countLoadings++;
            int currentThing = Integer.parseInt(input);

            if(countLoadings%3==0){
                totalPots+=currentThing;
                totalDetergentUsed+=currentThing*15;
            }
            else{
                totalDishes+=currentThing;
                totalDetergentUsed+=currentThing*5;
            }
            if(totalDetergentUsed>availableDetergent){
                break;
            }
            input = sc.nextLine();
        }
        if (totalDetergentUsed<=availableDetergent){
            int leftover = availableDetergent-totalDetergentUsed;
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n",totalDishes,totalPots);
            System.out.printf("Leftover detergent %d ml.",leftover);
        }
        else{
            int shortage = totalDetergentUsed-availableDetergent;
            System.out.printf("Not enough detergent, %d ml. more necessary!",shortage);
        }
    }
}
