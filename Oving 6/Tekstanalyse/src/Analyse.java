import java.util.Scanner;
public class Analyse {
    public static void main(String[] args) {

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Skriv inn en tekst her: ");
            String tekst = sc.nextLine();

            Tekstanalyse tekstanalyse = new Tekstanalyse(tekst);

            int forskjelligeBokstaver = tekstanalyse.forskjelligeBokstaver();
            int antallBokstaver = tekstanalyse.antallBokstaver();
            double prosent = tekstanalyse.ikkeBokstaver();
            int antallBestemtBokstaver = tekstanalyse.BestemtBokstav('a');
            String flestBestemtbokstav = tekstanalyse.flestBestemtBokstav();


            System.out.println("Teksten du sendte inn har: " + forskjelligeBokstaver + " forskjellige bokstaver");
            System.out.println(antallBokstaver + " antall bokstaver");
            System.out.println(String.format("%.2f prosent av teksten du la inn er ikke bokstaver", prosent));
            System.out.println("Du har " + antallBestemtBokstaver + " a'er i teksten");
            System.out.println("Teksten du sendte inn har " + flestBestemtbokstav + " som flest bokstaver");


        }
        while(true);
    }
}
