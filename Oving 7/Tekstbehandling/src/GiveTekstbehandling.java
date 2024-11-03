import java.util.Scanner;

public class GiveTekstbehandling {
    public static void main(String[] args) {

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Skriv inn en tekst du vil behandle her: ");
            String tekst = sc.nextLine();

            Tekstbehandling text = new Tekstbehandling(tekst);

            int antallOrd = text.antallOrd();
            int gjennomsnittOrdLengde = text.gjenomsnittOrdLengde();
            int periodeGjennomsnitt = text.periodeGjennomsnitt();
            String byttetTekst = text.textBytte();
            String orginalText = text.orginalText();
            String storText = text.storText();

            System.out.println("Din orginale tekst vises her: " + orginalText);
            System.out.println(" ");
            System.out.println("Antall ord i teksten = " + antallOrd);
            System.out.println("Gjennomsnittlig ordlengde i teksten er på " + gjennomsnittOrdLengde + " bokstaver");
            System.out.println("Gjennomsnittlig ordlenge i periodene delt opp av tegn '. ! ?' er: " + periodeGjennomsnitt);
            System.out.println(" ");
            System.out.println("Teksten din har nå byttet ordet 'finnes' med 'fins': " + byttetTekst);
            System.out.println(" ");
            System.out.println("Og sist men ikke minst: Dersom du ikke ser hva det står, her er teksten din i store bokstaver: " + storText);
            System.out.println("Artig? Prøv igjen da vel! ");

        }while(true);
    }
}

