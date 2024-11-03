import java.util.Scanner;

public class TilTimer {
    
    public static void main(String[]args) {

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Hvor mange sekunder vil du regne om til timer og minutter? ");
            int sekunder = scanner.nextInt();


            int minutt = sekunder/60;

            int rest_av_minutt= sekunder%60;

            int timer = minutt/60;

            int rest_av_time= minutt%60;


            System.out.println(sekunder + " sekunder er " + timer + "timer," + rest_av_time + "minutter og " + rest_av_minutt + "sekunder" );
        }
    }

}


//Skriv et program som leser inn et antall sekunder og beregner hvor mange timer, minutter og sekunder dette er. (Hint: Bruk heltallsdivisjon.) 