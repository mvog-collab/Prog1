import java.util.Scanner;

public class Gangetabell {
    public static void main(String[]args) {

        //prøve å legge inn at dersom slutt er større enn start, eller om noen skriver inn noe som 
        //ikke er sant at det blir en default melding og at denne forteller oss at man skal prøve igjen og skrive en melding som ber noen om å skrive inn et heltall

        int x=0;
        int y=0;

        Scanner scanner = new Scanner(System.in);
            System.out.print("For hvilken del av multiplikasjonstabellen ønsker du å skrive ut regnestykker? Start: ");
            x=scanner.nextInt();

            System.out.print("Slutt: ");
            y=scanner.nextInt();

        
        for(int a=x; a<=y; a++){
            for(int b=1; b<=10; b++){
                int c=a*b;
            System.out.println(a + " x " + b + " = " + c);
            }
       

        }
        
     }
    
    }


    
