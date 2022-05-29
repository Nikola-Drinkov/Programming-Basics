package ForLoops;

import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int points = 0;
        for(int i=0; i<text.length(); i++){
            switch (text.charAt(i)){
                case'a':
                    points+=1;
                    break;
                case'e':
                    points+=2;
                    break;
                case'i':
                    points+=3;
                    break;
                case'o':
                    points+=4;
                    break;
                case'u':
                    points+=5;
                    break;
            }
        }
        System.out.println(points);
    }
}
