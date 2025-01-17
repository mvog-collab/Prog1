import java.util.Random;
public class MinRandom {

    public static int nesteHeltall(int nedre, int ovre) {
        Random rand = new Random();
        return rand.nextInt(ovre-nedre+1) + nedre;
    }
    public static double nesteDesimaltall(double nedre, double ovre) {
        Random rand = new Random();
        return rand.nextDouble() * (ovre - nedre + 1) + nedre;
    }
    public static void main (String[]args) {
        System.out.println(nesteHeltall(1, 10));
        System.out.println(nesteDesimaltall(1.2, 2.2));
    }
}





/*
Oppgave 2
I oppgave 4 i kapittel 5 brukte du klassen java.util.Random. Metoden nextInt() er laget slikt at
den gir et heltall i intervallet fra og med 0 og opp til den tallverdien du sender inn som
argument.
Klassen tilbyr også en metode nextDouble() som gir deg et desimaltall uniformt
fordelt i intervallet (0,0, 1,0>15.(Her er 15 opphøyd) Denne metoden tar ingen argumenter.

Lag en klasse MinRandom som tilbyr følgende metoder:

public int nesteHeltall(int nedre, int ovre) // intervallet (nedre, ovre)

public double nesteDesimaltall(double nedre, double ovre) // intervallet >nedre, ovre>

15. Denne notasjonen betyr at 0,0 er med, mens 1,0 ikke er med.

Klassen skal ha et objekt av klassen java.util.Random som objektvariabel.
Metodene foran skal implementeres ved at man bruker dette objektet til å generere neste tilfeldige tall.

Resultatet skal så transformeres til det ønskede intervallet.'

Prøv klassen ved å lage mange tilfeldige tall av begge typer og forsikre deg om at de ligger i
de oppgitte intervallene
 */