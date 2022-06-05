package WhileLoop_Exercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookName = sc.nextLine();
        String currentBook = sc.nextLine();
        boolean found = false;
        int checkedCount = 0;
        while(!currentBook.equals("No More Books")){
            if(currentBook.equals(bookName)){
                found = true;
                break;
            }
            currentBook = sc.nextLine();
            checkedCount++;
        }
        if(found){
            System.out.printf("You checked %d books and found it.",checkedCount);
        }
        else{
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",checkedCount);
        }
    }
}
