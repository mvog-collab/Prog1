import java.util.Random;
import java.util.Scanner;
public class RandomTabell {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hvor mange ganger skal løkken kjøres?: ");
        int slutt = sc.nextInt();
        java.util.Random random = new java.util.Random();  //objekt av klassen java.util.random

        int [] antall = new int[10];          // tabell med tall 0,9

        for(int i= 0; i < slutt; i++){
        int tall= random.nextInt(10); //Henter et tilfeldig tall mellom 0,9.
        antall[tall]++;//Øker telleren fir det tallet jeg fikk
        }

        System.out.println("Antall forekomster av tallene 0,9: ");
        for (int i =0;i <antall.length; i++){
        System.out.println("Tall" + i + " : " + antall[i]);
        }
    }

}
