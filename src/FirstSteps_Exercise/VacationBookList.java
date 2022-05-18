package FirstSteps_Exercise;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str = Integer.parseInt(sc.nextLine());
        int str1 = Integer.parseInt(sc.nextLine());
        int dni  = Integer.parseInt(sc.nextLine());
        int obshtoVreme = str/str1;
        int VremeReq = obshtoVreme/dni;
        System.out.println(VremeReq);
    }
}
