import java.util.Scanner;
import java.util.ArrayList;

public class KlientStudent {
  public static void main(String[] args) {

    Oppgaveoversikt oppgaveoversikt = new Oppgaveoversikt();

    Scanner sc = new Scanner(System.in);
    System.out.print("Hva heter studenten du vil registrere?: ");
    String name = sc.nextLine();
    System.out.print("Hvor mange oppgaver har " + name + " gjort?: ");
    int oppgaver = sc.nextInt();

    oppgaveoversikt.registerNewStudent(name, oppgaver);

    sc.nextLine();
    System.out.println("Hvilken student i listen vil du øke antall oppgaver for? ");
    String newName = sc.nextLine();
    System.out.println("Hvor mange oppgaver har " + newName + " gjort ekstra?: ");
    int okning = sc.nextInt();


    boolean success = oppgaveoversikt.oktAntOppgForStudent(newName, okning);
    if (success) {
      System.out.println("Antall oppgaver er økt for " + newName);
    } else {
      System.out.println("Fant ikke studenten med navnet " + newName);
    }

    System.out.print("\nSkriv navnet på studenten for å finne antall oppgaver de har gjort: ");
    sc.nextLine(); // skrive opp eventuelle ekstra linjer
    String searchName = sc.nextLine();
    int antOppgaver = oppgaveoversikt.getAntallOppgaverForStudent(searchName);
    if (antOppgaver != -1) {
      System.out.println(searchName + " har gjort " + antOppgaver + " oppgaver.");
    } else {
      System.out.println("Ingen student funnet med navnet " + searchName);
    }

    System.out.println("\nOppdatert oversikt:");
    System.out.println(oppgaveoversikt);

    sc.close();
    }
  }
