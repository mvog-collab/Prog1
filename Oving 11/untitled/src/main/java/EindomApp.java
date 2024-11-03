import java.util.Scanner;
public class EindomApp {
  public static void main(String[] args){
    EindomRegister register = new EindomRegister();

    Eindom eindom1 = new Eindom(1445, "Gloppen", 77, 631, " ", 1017.6, "Jens Olsen" );
    Eindom eindom2 = new Eindom(1445, "Gloppen", 77, 131, "Syningom", 661.1, "Nicolay Madsen");
    Eindom eindom3 = new Eindom(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
    Eindom eindom4 = new Eindom(1445, "Gloppen", 74, 188, " ", 650.6, "Evilyn Jensen");
    Eindom eindom5 = new Eindom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård");

    register.registrerEindom(eindom1);
    register.registrerEindom(eindom2);
    register.registrerEindom(eindom3);
    register.registrerEindom(eindom4);
    register.registrerEindom(eindom5);

    Scanner sc = new Scanner(System.in);
  System.out.println("Hva ønsker du å gjøre");
    System.out.println("1: registrere eller legge til en eindom\n"
        + "2: Skrive ut alle de registrerte eindommene\n"
            + "3: Finne en spesiell eindom\n"
            + "4: Regne ut areal og gjennomsnittsareal\n"
        + "5: Avslutte programmet");
    System.out.println("Ditt valg: ");
    int x = sc.nextInt();
    sc.nextLine();
    switch (x) {
      case 1:
        System.out.println("Legg til en eindom i registeret: ");
        System.out.println("Komunenummer: ");
        int nummer = sc.nextInt();
        sc.nextLine();
        System.out.println("Komunenavn: ");
        String navn = sc.nextLine();
        sc.nextLine();
        System.out.println("Gårdsnummer: ");
        int gnr = sc.nextInt();
        sc.nextLine();
        System.out.println("Bruksnummer: ");
        int bnr = sc.nextInt();
        sc.nextLine();
        System.out.println("Areal: ");
        double area = sc.nextDouble();
        sc.nextLine();
        System.out.println( "Navn av eindom:");
        String nameOfEindom = sc.nextLine();
        sc.nextLine();
        System.out.println( "Navn av eier:");
        String nameOfOwner = sc.nextLine();

        Eindom nyEindom = new Eindom(nummer, navn, gnr, bnr, nameOfEindom, area, nameOfOwner);
        register.registrerEindom(nyEindom);
        System.out.println("Eindommen er lagt til.");
        break;
      case 2:
        System.out.println("Skrive ut alle eindommene i registeret");
        register.skrivUtAlleEindommer();  //printer denne ut alle eindommene?
        break;
      case 3:
        System.out.println("Søke etter eindom");
        System.out.println("Komunenummer: ");
        int komuneNummer = sc.nextInt();
        sc.nextLine();
        System.out.println( "Gårdsnummer:");
        int gardsnummer = sc.nextInt();
        sc.nextLine();
        System.out.println( "Bruksnummer:");
        int bruksnummer = sc.nextInt();
        register.finnEindomMedNummerGnrBnr(komuneNummer, gardsnummer, bruksnummer);

        break;
      case 4:
        System.out.println("Regne ut og vise gjennomsnittsareal:");
        register.finnGjennomsnittsAreal();

        break;
      case 5:
        System.out.println("Programmet avsluttes");
        return;
    }

  }
}
