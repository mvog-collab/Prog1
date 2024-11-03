
class Spiller {
    java.util.Random terning = new java.util.Random();
    private int sumPoeng = 0;
    private int terningkast;
    public boolean erFerdig = false;

  

    public int getSumPoeng() {
        return sumPoeng;
    }

    public void kastTerningen() {
        terningkast = terning.nextInt(6) + 1;
        if (terningkast==1) {
            sumPoeng=0;
        } else {
            sumPoeng += terningkast;
        }
    }

    public boolean erFerdig() {
        if (sumPoeng>100) {
            erFerdig=true;
        } else {
            erFerdig= false;
        }
        return erFerdig;
    }
}


    
/*Du skal programmere terningspillet 100 med to spillere, A og B. Reglene er som følger:
- A og B kaster terningen annenhver gang. 
- Antall øyne på terningen er antall poeng oppnådd i
denne runden. 
- Poengene summeres fortløpende. 
-Dersom en spiller kaster 1, settes summen
tilbake til 0. 
- Den som først passerer 100 poeng, har vunnet spillet.

- Lag en klasse som simulerer en spiller. Den kan ha sumPoeng som objektvariabel og
metoder som heter getSumPoeng(), kastTerningen() og erFerdig().

- For å simulere terningen skal du bruke klassen java.util.Random fra java-API-et. Denne
klassen brukes til å lage rekker med tilfeldige tall. 
La et objekt av klassen være
objektvariabel:
Java.util.Random tering= new java.util.Random(); // vi lager en tilfeldigtallgenerator
I metoden kastTerningen() henter du et tilfeldig tall i intervallet (0, 5) på følgende måte:
Int terningkast = terning.nextint(6);
Legg til 1 for å få et gyldig terningkast.

Lag et klientprogram som oppretter to objekter av klassen, ett for hver av spillerne. Lag en
løkke som kjører inntil en av spillerne har vunnet. 
I hvert gjennomløp av løkken skal hver
spiller kaste terningen en gang. Skriv ut rundenummer og poengsummene til hver av spillerne
i hvert gjennomløp. 

Det er sannsynligvis mest praktisk å skrive til kommandovinduet her.

En raffinering av spillet kan være å kreve at man skal komme akkurat til 100. Dersom denne
grensa er passert, skal neste kast trekkes fra poengsummen. Hvis man nå havner akkurat på
100, er man ferdig. Ellers legges neste kast til, og slik holder man på og legger til og trekker
fra inntil man kommer akkurat til 100.*/