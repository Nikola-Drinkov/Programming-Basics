package ForLoops_Exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int groups = Integer.parseInt(sc.nextLine());
        int totalPeople=0;
        int Musala = 0;
        int MontBlanc = 0;
        int Kilimanjaro = 0;
        int K2 = 0;
        int Everest = 0;
        for(int i=0; i<groups; i++){
            int currentGroup = Integer.parseInt(sc.nextLine());
            totalPeople+=currentGroup;
            if(currentGroup<=5){
                Musala+=currentGroup;
            }
            else if(currentGroup<=12){
                MontBlanc+=currentGroup;
            }
            else if(currentGroup<=25){
                Kilimanjaro+=currentGroup;
            }
            else if(currentGroup<=40){
                K2+=currentGroup;
            }
            else{
                Everest+=currentGroup;
            }
        }
        System.out.printf("%.2f%%%n",(double)Musala/totalPeople*100);
        System.out.printf("%.2f%%%n",(double)MontBlanc/totalPeople*100);
        System.out.printf("%.2f%%%n",(double)Kilimanjaro/totalPeople*100);
        System.out.printf("%.2f%%%n",(double)K2/totalPeople*100);
        System.out.printf("%.2f%%%n",(double)Everest/totalPeople*100);
    }
}
