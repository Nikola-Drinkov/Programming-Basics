package CondStatements_Advanced;

import java.util.Scanner;

public class AnimalType_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String animal = sc.nextLine();
        switch(animal){
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
            case "crocodile":
            case "tortoise":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
