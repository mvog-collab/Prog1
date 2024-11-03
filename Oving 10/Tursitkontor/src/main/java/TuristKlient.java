import java.util.List;
import java.util.Scanner;
public class TuristKlient {
  public static void main(String[] args) {
    ArrangementRegister register = new ArrangementRegister();  //oppretter et register for arrangementer

    register.registerNewArrangement(
        new Arrangement(1, "Halloween", "Trondheim", "TIHLDE", "Party", 202410301900L));
    register.registerNewArrangement(
        new Arrangement(2, "Julebord", "Trondheim", "TIHLDE", "Fest", 202411061900L));
    register.registerNewArrangement(
        new Arrangement(3, "Julegrøt", "Elverum", "Elverumshallen", "Veldighet", 202412231400L));
    do {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hva ønsker du å gjøre?\n"
        + "1: legge til et nytt arrangement i registeeret"
        + "2: finne alle arrangement for et bestemt sted\n"
        + "3: finne alle arrangement for en bestemt dato)\n"
        + "4: finne alle arrangement innenfor to datoer\n"
        + "5: lage lister over alle arrangemen basert på hver kategori\n"
        + "6: avslutte programmet og dra på et arrangement");

    System.out.print("Ditt valg: ");
    int x = sc.nextInt();
    sc.nextLine();
      switch (x) {
        case 1:
          System.out.println("Legg til et nytt arrangement: ");
          System.out.println("Nummer: ");
          int nummer = sc.nextInt();
          sc.nextLine();
          System.out.println("Navn: ");
          String navn = sc.nextLine();
          sc.nextLine();
          System.out.println("Sted: ");
          String lokasjon = sc.nextLine();
          sc.nextLine();
          System.out.println("Arrangert av: ");
          String arrangor = sc.nextLine();
          sc.nextLine();
          System.out.println( "Type:");
          String type = sc.nextLine();
          sc.nextLine();
          System.out.println("Tidspunkt: (yymmddhhmm): ");
          long tidspunkt = sc.nextLong();

          Arrangement nyttArrangement = new Arrangement(nummer, navn, arrangor, lokasjon, type, tidspunkt);
          register.registerNewArrangement(nyttArrangement);
          System.out.println("Arrangementet er lagt til.");
          break;
        case 2:
          System.out.println("For hvilket sted vil du finne arrangement?");
          String sted = sc.nextLine();
          List<Arrangement> arrangementSted = register.bestemtSted(sted);
          System.out.println("Arrangementer i " + sted + ";");
          register.skrivUt(arrangementSted);
          break;
        case 3:
          System.out.println("For hvilken dato vil du finne arrangement? (yyyymmdd)");
          System.out.println("Dato: ");
          long dato = sc.nextLong();
          sc.nextLine();
          List<Arrangement> arrangementPaDato = register.finnArrangementerPaTidspunkt(dato);
          System.out.println("\nArrangementer på " + dato + ":");
          register.skrivUt(arrangementPaDato);
          break;
        case 4:
          System.out.println("For hvilke datoer vil du finne arrangementer mellom? (yyyymmddhhhh)");
          System.out.println("Start: ");
          long start = sc.nextLong();
          sc.nextLine();
          System.out.println("Slutt: ");
          long slutt = sc.nextLong();
          sc.nextLine();
          List<Arrangement> arrangementIntervall = register.finnArrangementInnenforTidspunkt(start,
              slutt);
          System.out.println("\nArrangementer mellom " + start + " og " + slutt + ":");
          register.skrivUt(arrangementIntervall);
          break;
        case 5:
          System.out.println("Etter hvilken kategori vil du sortere arrangementene?\n"
              + "1: sted"
              + " 2: type"
              + " 3: tidspunkt"
              + " 4: avslutt");
          int y = sc.nextInt();
          sc.nextLine();
          switch (y) {
            case 1:
              System.out.println("\nArrangementer sortert etter sted:");
              register.sorterArrangementerEtterSted();
              break;
            case 2:
              System.out.println("\nArrangementer sortert etter type:");
              register.sorterArrangementerEtterType();
              break;
            case 3:
              System.out.println("\nArrangementer sortert etter tidspunkt:");
              register.sorterArrangementerEtterTidspunkt();
              break;
            case 4:
              System.out.println("Programmet vil nå avsluttes");
              return;
          }
          register.skrivUtAlleArrangementer();
          break;
        case 6:
          System.out.println("Den er good! Kos deg på arrangement!");
          System.out.println("Programmet vil nå avsluttes");
          return;
        default:
          System.out.println("Ugyldig valg! Vennligst velg 1, 2, 3, 4 eller 5");
          break;
      }
    }while (true);
  }
}

