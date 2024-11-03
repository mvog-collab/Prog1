import java.util.Scanner;

public class kjottdeig {

    public static void main(String[]args) {

        try(Scanner scanner= new Scanner(System.in)) {
            System.out.print("Hvor mye veier mengden kjøttdeig fra merke A i gram? ");
            double vektA = scanner.nextDouble();

            System.out.print("Hvor mye koster mengden kjøttdeig fra merke A? ");
            double prisA = scanner.nextDouble();

            System.out.print("Hvor mye veier mengden kjøttdeig fra merke B i gram? ");
            double vektB = scanner.nextDouble();
        
            System.out.print("Hvor mye koster mengden kjøttdeig fra merke B? ");
            double prisB = scanner.nextDouble();
            
        double pris_per_vektA= prisA/vektA;

        double pris_per_vektB= prisB/vektB;

        if(pris_per_vektA>pris_per_vektB){
            System.out.println("Kjøttdeig B blir billigere med " + pris_per_vektB + " kr/g");
        }else if(pris_per_vektA==pris_per_vektB){
             System.out.println("Kjøttdeigene har lik pris per vekt, og vil koste deg like mye");
        }else{
            System.out.println("Kjøttdeig A blir billigere med " + pris_per_vektA + " kr/g");
        }
           

        }

    }

}
    



