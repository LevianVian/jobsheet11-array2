
import java.util.Scanner;


public class CinemaWithScanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] audience = new String[4][2];

        int row, column;
        String name, next;

        while (true){
            System.out.println("Enter a name: ");
            name = sc.nextLine();
            System.out.println("Enter row number: ");
            row = sc.nextInt();
            System.out.println("Enter column number: ");
            column = sc.nextInt();
            sc.nextLine(); 

            audience[row - 1][column - 1] = name;
            System.out.println("Are there any other audience? to be added? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }

        }
    }
}