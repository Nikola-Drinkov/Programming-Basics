package CondStatements_Advanced;

import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();

        if(age<16){
            if(gender.equals("m")){
                System.out.println("Master");
            }
            else{
                System.out.println("Miss");
            }
        }
        else{
            if(gender.equals("m")){
                System.out.println("Mr.");
            }
            else{
                System.out.println("Ms.");
            }
        }
    }
}
