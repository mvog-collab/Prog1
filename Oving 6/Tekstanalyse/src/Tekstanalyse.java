class Tekstanalyse {

    char tegn;
    int lengde;
    int forskjelligeBokstaver;
    int antallBokstaver;
    int ikkeBokstaver;
    int antallBestemtBokstav;
    String flestBestemtBokstav;

    String tekst = new String();
    int[] antallTegn = new int[30];


    public Tekstanalyse(String tekst) {
        this.tekst = tekst.toLowerCase();

        for (int i = 0; i < tekst.length(); i++) {   // for hver element i teksten, fra 0, lengden av teksten
            char tegn = this.tekst.charAt(i);             // tegn henter symbol på bestemt posistjon i i tekste tekst

            if (tegn >= 'a' && tegn <= 'z') {          // side a = index 0 finner vi tegn-a og står igjen med indexen til bokstaven
                int bokstavIndeks = tegn - 'a';
                antallTegn[bokstavIndeks]++;            // plusser antall bokstaver av hver vi har i teksten, inn i listen antallTegns
            } else {
                switch (tegn) {
                    case 'æ':
                        antallTegn[26]++;
                        break;
                    case 'ø':
                        antallTegn[27]++;
                        break;
                    case 'å':
                        antallTegn[28]++;
                        break;
                    default:
                        antallTegn[29]++;
                }

            }
        }

    }

    public int forskjelligeBokstaver() {
        for (int i = 0; i < (antallTegn.length - 1); i++) {
            if (antallTegn[i] >= 1) {
                forskjelligeBokstaver++;
            }
        }
        return forskjelligeBokstaver;
    }

    public int antallBokstaver() {
        for (int i = 0; i < (antallTegn.length - 1); i++) {
            antallBokstaver += antallTegn[i];
        }
        return antallBokstaver;

    }

    public double ikkeBokstaver() {
        double ikkeBokstaver = antallTegn[29];
        double prosent = (((double) ikkeBokstaver / antallBokstaver) * 100);
        return prosent;
    }

    public int BestemtBokstav(char bokstav) {
        for (int i = 0; i < (tekst.length() - 1); i++) {
            if (tekst.charAt(i) == bokstav) {
                antallBestemtBokstav++;
            }
        }
        return antallBestemtBokstav;
    }

    public String flestBestemtBokstav() {
        // Finn den største verdien i antallTegn-arrayen
        int max = 0;
        for (int k : antallTegn) {
            if (k > max) {
                max = k;
            }
        }

        // Initialiserer en streng for å holde bokstaven(e) med maks forekomster
        String bokstav = "";

        // Sjekk hvilken bokstav som har verdien `max`
        for (int j = 0; j < antallTegn.length; j++) {
            if (antallTegn[j] == max) {
                if (j < 26) {

                    // Bokstavene a-z
                    bokstav += Character.toString((char) (j + 'a'));  // 'a' har verdien 97
                } else if (j == 26) {
                    bokstav += "æ";
                } else if (j == 27) {
                    bokstav += "ø";
                } else if (j == 28) {
                    bokstav += "å";
                }
                flestBestemtBokstav += bokstav + " ";
            }
        }
        return bokstav;
    }
}






