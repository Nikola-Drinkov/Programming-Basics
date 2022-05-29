package ForLoops;

import java.util.Scanner;

public class CharacterSequence_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        for(int i=0; i<text.length();i++){
            System.out.println(text.charAt(i));
        }
    }
}
