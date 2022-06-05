package WhileLoop_Exercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int availableWidth = Integer.parseInt(sc.nextLine());
        int availableLength = Integer.parseInt(sc.nextLine());
        int availableHeight = Integer.parseInt(sc.nextLine());
        int spaceAvailable = availableHeight*availableLength*availableWidth;
        int spaceRequired = 0;
        boolean noSpace = false;
        String input = sc.nextLine();
        while(!input.equals("Done")){
            int countBoxes = Integer.parseInt(input);
            spaceRequired+=countBoxes;
            if(spaceAvailable<spaceRequired){
                noSpace=true;
                break;
            }
            input = sc.nextLine();
        }
        if(noSpace){
            int shortage = spaceRequired-spaceAvailable;
            System.out.printf("No more free space! You need %d Cubic meters more.",shortage);
        }
        else{
            int excess = spaceAvailable-spaceRequired;
            System.out.printf("%d Cubic meters left.",excess);
        }
    }
}
