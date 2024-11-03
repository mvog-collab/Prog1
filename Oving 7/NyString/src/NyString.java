
public final class NyString {          //hvordan gjøre klassen immutabel?
    private String text = "";


    public NyString(String textInput) {
        this.text = textInput;
    }

    public String removeFirstLetter() {
        String[] words = text.split(" ");                  // teksten deles opp for hvert mellomrom = deles opp i ord og legges inn i en liste
        StringBuilder newText = new StringBuilder();            //  bygger den nye teksten jeg vil printe ut

        for (int i = 0; i < words.length; i++) {                // for hvert ord i listen
            if (words[i].length() > 0) {                        // hvis ordet er større enn 0
                char firstLetter = words[i].charAt(0);          // henter ut den første bokstaven til hvert ord  med charAt(0)
                newText.append(firstLetter);                    // Bygger den nye teksten med append(av de første boksatvene)
            } else {
                throw new IllegalArgumentException("Du må skrive en tekst");     // hvis teksten ikke har noen ord, kast argument:
            }
        }

        return newText.toString();                              // returnerer den nye teksten som en String
    }

    public String removeRandomLetter() {
        String[] words = text.split(" ");               // deler opp teksen i ord, splittes av mellomrom med text.split(" ") og legger alle ordene i en liste
        StringBuilder removedText = new StringBuilder();      // bygger den nye teksten, da string ikke kan endres direkte

        int i = 0;

        while(i<words.length){                                // går gjennom listen med ord for lengden av listen
            String word = words[i];                           // hvert ord er lik indeksen av listen med ordene
            String newWord = word;                            // et nytt ord er hvert ord

            while(newWord.indexOf('e') != -1){                 // sålenge et nytt ord inneholder bokstaven e, sjekkes ved om indeksen ikke er -1
                int index = newWord.indexOf('e');               // er indeksen til bokstaven e, på et bestemt sted inne i ordet, finnes ved indexOf
                newWord = newWord.substring(0, index) + newWord.substring(index + 1);   // det nye ordet blir nå alle bokstavene fram til indeksen av e + alle bokstavene fra indeks + 1 og ut
            }

            removedText.append(newWord).append(' ');     // bygger den nye teksten removedTekst med stringbuilder og legger til alle de nye ordene uten e med append, og legger til mellomrom mellom hvert ord

            i++;     // går til neste ord, så lenge i er mindre enn lengden av listen med ord
        }
        return removedText.toString();
    }
}

