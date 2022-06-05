package WhileLoop_Exercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cakeLength = Integer.parseInt(sc.nextLine());
        int cakeWidth = Integer.parseInt(sc.nextLine());
        int totalPieces = cakeLength*cakeWidth;
        int eatenPieces = 0;
        boolean noCake = false;
        String input = sc.nextLine();
        while (!input.equals("STOP")){
            int currentPieces = Integer.parseInt(input);
            eatenPieces+=currentPieces;
            if(eatenPieces>=totalPieces){
                noCake = true;
                break;
            }
            input = sc.nextLine();
        }
        if(noCake){
            int shortage = eatenPieces-totalPieces;
            System.out.printf("No more cake left! You need %d pieces more.",shortage);
        }
        else{
            int excess = totalPieces-eatenPieces;
            System.out.printf("%d pieces are left.",excess);
        }

    }
}
