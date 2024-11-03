import java.sql.SQLOutput;
import java.util.Scanner;
public class KlientPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hva er ditt fornavn: ");
        String fornavn = sc.nextLine();
        System.out.print("Hva er ditt etternavn: ");
        String etternavn = sc.nextLine();
        System.out.print("Når ble du født: ");
        int fodselsaar = sc.nextInt();

        Person person = new Person(fornavn, etternavn, fodselsaar);

        System.out.print("Som arbeidstaker, hva er ditt arbeidstakernummer?: ");
        int arbeidstakerNummer = sc.nextInt();
        System.out.print("Når ble du ansatt?: ");
        int ansettelsesaar = sc.nextInt();
        System.out.print("Hva er din nåværende månedslønn?: ");
        int maanedlonn = sc.nextInt();
        System.out.print("Hvor mye skatter du i prosent?: ");
        float skatteprosent = sc.nextFloat();

        Arbeidstaker arbeidstaker = new Arbeidstaker(person, arbeidstakerNummer, ansettelsesaar, maanedlonn, skatteprosent);

        System.out.println("Arbeidstaker:");
        System.out.println("Fullt navn: " + arbeidstaker.getFulltNavn());
        System.out.println("Alder: " + arbeidstaker.getAlder() + " år");
        System.out.println("År i bedriften: " + arbeidstaker.aarIBedriften() + " år");
        System.out.println("Mådenslønn: " + arbeidstaker.getMaanedslonn() + " kr");
        System.out.println("Skattetrekk per måned: " + arbeidstaker.getSkatteTrekk() + " kr");
        System.out.println("Bruttolønn per år: " + arbeidstaker.getBruttoLonn() + " kr");
        System.out.println("Skattetrekk per år: " + arbeidstaker.getSkattAar() + " kr");

        int antallAar = 5;
        if (arbeidstaker.getLengerEnn(antallAar)){
            System.out.println("Arbeidstaker har vært ansatt i mer enn " + antallAar + " år");
        } else {
            System.out.println("Arbeidstaker har vært ansatt i mindre enn " + antallAar + " år");
        }

        System.out.println("\n" + arbeidstaker);

        do {
            System.out.println("Hva ønsker du å endre om arbeidstakeren?");
            System.out.println("1: Skatteprosent \n2: Månedslønn \n3: Ingenting ");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Hva er den nye skatteprosenten?");
                    float nySkatteprosent = sc.nextFloat();
                    arbeidstaker.setSkatteprosent(nySkatteprosent);
                    System.out.println("Oppdatert informasjon om arbeidstaker:");
                    System.out.println("\n" + arbeidstaker);
                    break;
                case 2:
                    System.out.println("Hva er den nye månedslønnen?");
                    int nyMaanedslonn = sc.nextInt();
                    arbeidstaker.setMaanedslonn(nyMaanedslonn);
                    System.out.println("Oppdatert informasjon om arbeidstaker:");
                    System.out.println("\n" + arbeidstaker);
                    break;
                case 3:
                    System.out.println("Den er god, da er all informasjon om arbeidstaker endelig. \n" + arbeidstaker + "\nProgrammet vil nå avsluttes");
                    System.exit(0);
                    break;
            }
        }while(true);

    }
}


