public class Matriseprogram {
    public static void main(String[] args) {

        double [][] array1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};

        double [][] array2 = {
                {3, 1, 1},
                {4, 1, 2},
                {3, 1, 1}};

        double [][] array3 = {
                {2, 1, 2},
                {1, 1, 1},
                {2, 1, 1}
        };

    Matrise matrise1 = new Matrise(array1);    // klassen matrise, navn på objektet = ny av konstruktøren( objekt)
    Matrise matrise2 = new Matrise(array2);
    Matrise matrise3 = new Matrise(array3);

    // Matriseaddisjon
    Matrise summertMatrise = matrise1.matriseAddisjon(matrise2);
   // String matriseAddisjon = summertMatrise;

    //Matrisemultiplikasjon
    Matrise produktMatrise = matrise1.matriseMultiplikasjon(matrise3);

  //  String matriseMultiplikasjon = produktMatrise.printMatrise();

    //Matrisetransponering
    Matrise transponertMatrise = matrise1.matriseTransponering();
  //  String matriseTransponering = transponertMatrise.printMatrise();


    System.out.println("Den summerte matrisen: ");
    System.out.println(summertMatrise);

    System.out.println("Den multipliserte matrisen: ");
    System.out.println(produktMatrise);

    System.out.println("Den transponerte matrisen av matrise1: ");
    System.out.println(transponertMatrise);
    }
}
