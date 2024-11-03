import java.util.Scanner;

class Tekstbehandling {
    String text = " ";
    String [] words;
    String [] periods;
    int totalBokstaver;


    public Tekstbehandling(String textInput) {
        this.text = textInput;
        this.words = text.split(" ");
        this.periods = text.split("[.!:?]+");          // holde logikk i metodene!
    }

    public int antallOrd(){
        int antallOrd = 0;
        for (int i= 0; i< words.length; i++){
            antallOrd+= 1;
        }
        return antallOrd;
    }

    public int gjenomsnittOrdLengde(){
        int totalBokstaver = 0;
        int totalWords = words.length;

        for (int i= 0; i< words.length; i++){
            totalBokstaver += words[i].length();
        }

        if (totalWords == 0) {
            throw new IllegalArgumentException("Teksten inneholder ingen ord");
        }
        return totalBokstaver/totalWords;
    }
    public int periodeGjennomsnitt(){
        int totalBokstaver = 0;
        int totalWordsPeriods = periods.length;

        for (int i= 0; i< periods.length; i++){
            totalBokstaver += periods[i].length();
        }

        if (totalWordsPeriods == 0) {
            throw new IllegalArgumentException("Teksten inneholder ingen ord");
        }
        return (totalBokstaver/totalWordsPeriods);
    }

    public String textBytte() {
        StringBuilder byttetText = new StringBuilder();
        String ordSomSkalByttes = "finnes";
        for (int i = 0; i < words.length; i++) {
            if (ordSomSkalByttes.equals(words[i])) {
                byttetText.append("fins");
            } else {
                byttetText.append(words[i]);
            }
                byttetText.append(" ");
        }
        return byttetText.toString();
    }

    public String orginalText(){
        StringBuilder orginalText = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            orginalText.append(words[i]);
            orginalText.append(" ");
        }
        return orginalText.toString();
    }

    public String storText(){
        StringBuilder storText = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            storText.append(words[i].toUpperCase());
            storText.append(" ");
        }
        return storText.toString();
    }
}
