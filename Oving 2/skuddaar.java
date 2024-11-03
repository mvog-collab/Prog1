import java.util.Scanner;

public class skuddaar {
    public static void main(String[]args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Hvilket år vil du sjekke om er et skuddår? ");
            int aar = scanner.nextInt();

            if (aar%4==0) {
                System.out.println(aar + " er et skuddår");

            } else if (aar%400==0) {
                System.out.println(aar + " er et skuddår");

            } else {
                System.out.println(aar + " er ikke et skuddår");

            }
            

        }

        }
    
}
