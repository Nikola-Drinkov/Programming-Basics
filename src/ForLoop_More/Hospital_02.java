package ForLoop_More;

import java.util.Scanner;

public class Hospital_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int period = Integer.parseInt(sc.nextLine());
        int treated = 0;
        int untreated = 0;
        int doctors = 7;
        for(int i=1; i<=period; i++){
            if(i%3==0){
                if(treated<untreated){
                    doctors++;
                }
            }
            int patients = Integer.parseInt(sc.nextLine());
            if(patients<=doctors){
                treated+=patients;
            }
            else{
                untreated+=patients-doctors;
                treated+=doctors;
            }
        }
        System.out.printf("Treated patients: %d.%n",treated);
        System.out.printf("Untreated patients: %d.",untreated);
    }
}
