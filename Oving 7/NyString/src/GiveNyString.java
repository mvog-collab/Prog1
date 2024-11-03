import java.util.Scanner;

public class GiveNyString {
    public static void main(String[] args) {

        do {

            Scanner sc = new Scanner(System.in);
            System.out.print("Skriv inn en tekst her: ");
            String tekst = sc.nextLine();

            NyString text = new NyString(tekst);


            String firstLetterRemoved = text.removeFirstLetter();
            String randomLetterRemoved = text.removeRandomLetter();

            System.out.println("De første bokstavene i teksten din lagt sammen blir: " + firstLetterRemoved);

            System.out.println("Teksten uten bokstaven e blir nå: " + randomLetterRemoved);
        }
        while (true);

    }
}



