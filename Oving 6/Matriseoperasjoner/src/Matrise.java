
final class Matrise {                                    // immutabel klasse ved å skrive final

    private final double[][] matrise;                        // immutabel array ved å sette final
    private final int rader;
    private final int kolonner;

    public Matrise(double[][] matriseInput) {         //konstruktør
        this.rader = matriseInput.length;
        this.kolonner = matriseInput[0].length;

        matrise = new double[rader][kolonner];

        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                matrise[i][j] = matriseInput[i][j];
            }
        }
    }

    public Matrise matriseAddisjon(Matrise matrise2) {
        if (this.rader != matrise2.rader || this.kolonner != matrise2.kolonner) {
            throw new IllegalArgumentException(" Matriser må ha samme dimensjoner for addisjon. ");
        }
        double[][] summertMatrise = new double[this.rader][this.kolonner];
        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                summertMatrise[i][j] = this.matrise[i][j] + matrise2.matrise[i][j];
            }
        }
        return new Matrise(summertMatrise);
    }

    public Matrise matriseMultiplikasjon(Matrise matrise3) {
        if (this.rader != matrise3.kolonner || this.kolonner != matrise3.rader) {
            throw new IllegalArgumentException(" Hvis matrise1 er mxn må den andre matrisen være av dimensjon nxm");
        }
        double[][] produktMatrise = new double[this.rader][matrise3.kolonner];
        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                produktMatrise[i][j] = 0;
                for (int k = 0; k < this.kolonner; k++) {
                    produktMatrise[i][j] += this.matrise[i][k] * matrise3.matrise[k][j];

                }
            }
        }
        return new Matrise(produktMatrise);

    }

    public Matrise matriseTransponering() {
        double[][] transponertMatrise = new double[this.kolonner][this.rader]; //lage en ny matrise for resultatet av denne metoden, der transponeringen skal lagres

        for(int i=0; i<rader; i++) {
            for(int j=0; j< kolonner; j++){
                transponertMatrise[j][i]=this.matrise[i][j];

            }
        }
        return new Matrise(transponertMatrise);
    }

    @Override
    public String toString() {
        String matriseString = "";
        for (int i = 0; i < rader; i++) {
            for (int j = 0; j < kolonner; j++) {
                matriseString += Double.toString(this.matrise[i][j]) + " ";
            }
            matriseString += "\n";
        }
        return matriseString;
    }

}




/*

Klassen skal være immutabel. Det vil si at alle metodene må lage nye metoder som returneres.
Dersom operasjonene er umulige, skal metodene returnere null.

Lag et enkelt klientprogram som kan brukes til å teste klassen.


Forstå dette før du begynner videre med matrisemultiplikasjonen:

       // Resultatmatrise for produktet A * B
        int[][] result = new int[A.length][B[0].length];


 */