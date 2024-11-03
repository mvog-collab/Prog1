import java.util.Scanner;

public class Primtall {

    public static void main(String[]args) {
        Scanner scanner= new Scanner(System.in); 
        do {
            boolean primtall=true;

            System.out.println("Skriv inn et tall som du vil sjekke om er et primtall: ");

            int tall=scanner.nextInt();
                
            for (int i = 1; i <tall; i++) { //begynner på to da man ikke kan dele på null, og alle 1 er delelig på 1
                    if (tall%i==0 && i != 1){    // && i != 1 betyr at den sjekker at i ikke er lik 1            
                        primtall = false;
                    }
                } 
                if(primtall == false){
                    System.out.println(tall + " er ikke et primtall");
                }
                else { 
                    System.out.println(tall +" er et primtall. Gratulerer!");  
                }  
        }while (true);
    }
}
        





//Skriv et program som finner ut om et tall er et primtall. Et primtall er et tall som kun kan deles
//med 1 og med seg selv uten å få rest. Les inn tallet fra brukeren og la programmet repetere
//slik at flere tall kan analyseres.