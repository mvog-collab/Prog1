import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*  System.out.println("Hello World");
        //declared / initialized array
        int [] nedborSep = new int [30];

        double [] nedborSepD = new double [30];

        String [] testArray = new String [10];
        System.out.println(testArray[0]);

        System.out.println(nedborSep[29] + nedborSepD[0]);

        String [] week = {"one", "three", "four", "five"};
        System.out.println(week[2]);

        System.out.println(week[0] + " " + week[2]);

        String allStrings = "";
        for (int index = 0; index < week.length; index++) {
            allStrings += week[index];
        }
        System.out.println(allStrings);

        try {
            System.out.println(week[week.length]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.toString());
        }


//Matrise
        int [][] nedborNov = new int [3][5];

        int count = 0;
        for(int indexX = 0; indexX<3; indexX ++){
            for (int indexY=0; indexY<5; indexY++){
                System.out.println(nedborNov[indexX][indexY]);
                count ++;
            }
        }
        System.out.println(count);

        // kopiering av tabell
        // anotherMatrix[indexX][indexY] = nedborNov[indexX][indexY]
        */


     int [] tab1 = {1,2,3,4,5};
     //int [] tab2 = {1,1,1,1,1};
     int indexTab2 = 0;

     /*
     for (int index = tab1.length; index> 0; index--){
         //System.out.println(tab1[index-1]);
         tab2[indexTab2++] = tab1[index-1];
     }
     for (int index=0; index<tab2.length-1; index++)
        System.out.println(tab2[index]);
      */
    int [] tab2 = Arrays.copyOfRange(tab1, 3, tab1.length);



    }
}

