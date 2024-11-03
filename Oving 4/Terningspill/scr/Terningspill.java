class Terningspill {
    public static void main(String[] args) {
        int runde = 0;

        Spiller spillerA = new Spiller();
        Spiller spillerB = new Spiller();

        while (!spillerA.erFerdig() && !spillerB.erFerdig()){
            spillerA.kastTerningen();
            spillerB.kastTerningen();
            runde++;
            System.out.println("Runde: " + runde + "\nPoengsum spiller A: " + spillerA.getSumPoeng());
            System.out.println("Runde: " + runde + "\nPoengsum spiller B: " + spillerB.getSumPoeng());
        }
        
        if (spillerA.erFerdig) {
            System.out.println("Spiller A har fått over 100 poeng og vant");
        } else { 
            System.out.println("Spiller B har fått over 100 poeng og vant");
        }
    }
}

