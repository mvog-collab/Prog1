import java.util.Scanner;
public class Brok {

    int teller;
    int nevner;
    String sum;
    String minus;
    String prod;
    String dele;


    // Lager to konstruktører for brøkene
    public Brok(int teller, int nevner) {
        if (teller == 0) {
            throw new IllegalArgumentException("Nevneren kan ikke være null");
            //kan ikke deles på null
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    public Brok (int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public void getSum(Brok annenBrok) {
        int sumTeller = (this.teller * annenBrok.nevner) + (this.nevner * annenBrok.teller);
        int sumNevner = (this.nevner * annenBrok.nevner);
        this.sum = (sumTeller + "/" + sumNevner);
    }

    public void getMinus(Brok annenBrok) {
        int minTeller = (this.teller * annenBrok.nevner) - (this.nevner * annenBrok.teller);
        int minNevner = (this.nevner * annenBrok.nevner);
        this.minus = (minTeller + "/" + minNevner);
    }
    public void getProdukt(Brok annenBrok) {
        int prodTeller = this.teller * annenBrok.teller;
        int prodNevner = this.nevner * annenBrok.nevner;
        this.prod = (prodTeller + "/" + prodNevner);
    }
    public void getDele(Brok annenBrok) {
        int deleTeller = this.teller / annenBrok.teller;
        int deleNevner = this.nevner / annenBrok.nevner;
        this.dele= (deleTeller + "/" + deleNevner);
    }

    //Klientprogram
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hvilken regneoperasjon vil du utføre med brøkene dine \n 1: Addere \n 2: Subtrahere \n 3: Multiplisere \n 4: Dividere");
        int valg = sc.nextInt();

        //Brøk 1
        System.out.println("Brøk nr. 1:");
        System.out.println("Skriv inn teller: ");
        int teller1 = sc.nextInt();
        System.out.println("Skriv inn nevneren: ");
        int nevner1 = sc.nextInt();

        //Brøk2
        System.out.println("Brøk nr. 2:");
        System.out.println("Skriv inn teller: ");
        int teller2 = sc.nextInt();
        System.out.println("Skriv inn nevneren: ");
        int nevner2 = sc.nextInt();

        Brok brok1 = new Brok(teller1, nevner1);
        Brok brok2 = new Brok(teller2, nevner2);

        switch (valg) {
            case 1:
                brok1.getSum(brok2);
                System.out.println("Svar: " + brok1.sum);
                break;
            case 2:
                brok1.getMinus(brok2);
                System.out.println("Svar: " + brok1.minus);
                break;
            case 3:
                brok1.getProdukt(brok2);
                System.out.println("Svar: " + brok1.prod);
                break;
            case 4:
                brok1.getDele(brok2);
                System.out.println("Svar: " + brok1.dele);
                break;
            default:
                System.out.println("Ugyldig valg. Vennligst prøv igjen.");
                break;
        }
        sc.close();
    }
}

