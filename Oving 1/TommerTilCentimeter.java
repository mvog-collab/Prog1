import java.util.Scanner;

public class TommerTilCentimeter {
    
    public static void main(String[]args) {

        final double forholdstall = 2.54;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn en verdi for tommer her: ");

        double tommer = scanner.nextDouble();
        double centimeter = tommer * forholdstall;

        System.out.println(tommer + " tommer er lik " + centimeter + "cm");

        scanner.close();
    }

}



