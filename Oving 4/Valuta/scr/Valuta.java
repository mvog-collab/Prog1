

import java.util.Scanner;

public class Valuta {

    public static void main(String[] args) {
        // Forholdstall:
        double dollar_til_kroner = 10.65;
        double euro_til_kroner = 11.78;
        double svenske_til_norske = 1.03;

        Scanner scanner = new Scanner(System.in);
        int x;  // Variabel for brukerens valg
        
        // Start do-while-løkken
        do {
            // Meny
            System.out.print("1: dollar \n2: euro \n3: svenske kroner \n4: avslutt\n");
            System.out.print("Hvilken valuta vil du regne om til norske kroner?: ");
            x = scanner.nextInt();

            if (x == 1) {
                System.out.println("Du valgte dollar. \nHvor mange dollar vil du regne om til norske kroner?: ");
                double dollar = scanner.nextDouble();
                System.out.println(dollar + " dollar er " + dollar * dollar_til_kroner + " norske kroner\n");
            } else if (x == 2) {
                System.out.println("Du valgte euro. \nHvor mange euro vil du regne om til norske kroner?: ");
                double euro = scanner.nextDouble();
                System.out.println(euro + " euro er " + euro * euro_til_kroner + " norske kroner\n");
            } else if (x == 3) {
                System.out.println("Du valgte svenske kroner. \nHvor mange svenske kroner vil du regne om til norske kroner?: ");
                double svenske = scanner.nextDouble();
                System.out.println(svenske + " svenske kroner er " + svenske * svenske_til_norske + " norske kroner\n");
            } else if (x == 4) {
                System.out.println("Du avsluttet programmet.");
            } else {
                System.out.println("Ugyldig valg, prøv igjen.");
            }

        } while (x != 4);  // Løkken fortsetter helt til brukeren velger 4 (avslutt)

        scanner.close();  // Avslutter scanneren når programmet er ferdig

    }
}
//Bruke switch 






        
    
          

    



