import java.util.Scanner;

public class TimerogSekunder {

    public static void main(String[] args) {

        int sekunder_i_time = 60*60;

        int sekunder_i_minutt = 60;

        try (Scanner scanner = new Scanner(System.in)) {        

            System.out.print("Hvor mange timer vil du regne om til sekunder? ");
            int timer = scanner.nextInt();

            System.out.print("Hvor mange minutter vil du regne om til sekunder? ");
            int minutter = scanner.nextInt();

            System.out.print("Og til slutt, hvor mange sekunder vil du inkludere i omregningen? ");
            int sekunder = scanner.nextInt();

            int timer_omregnet =  timer *sekunder_i_time;

            int minutter_omregnet = minutter*sekunder_i_minutt;

            int totalt = timer_omregnet+minutter_omregnet+sekunder;

            System.out.println(timer + "timer, " + minutter + " minutter og " + sekunder + " sekunder er til sammen " + totalt + " sekunder " );

        }

    }

}






//Skriv et program som regner om timer, minutter og sekunder til totalt antall sekunder. Sett opp testdatasett og prøv ut programmet.