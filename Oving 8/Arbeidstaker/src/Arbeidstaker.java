import java.util.GregorianCalendar;

public class Arbeidstaker{

    private final Person personlia;
    private final int arbeidstakerNummer;
    private final int ansettelsesaar;
    private int maanedslonn;
    private float skatteprosent;
    java.util.GregorianCalendar kalender = new GregorianCalendar();
    int aar = kalender.get(java.util.Calendar.YEAR);


    public Arbeidstaker(Person personlia,int arbeidstakerNummer, int ansettelsesaar, int maanedslonn, float skatteprosent) {
        this.personlia = personlia;
        this.arbeidstakerNummer = arbeidstakerNummer;
        this.ansettelsesaar = ansettelsesaar;
        this.maanedslonn = maanedslonn;
        this.skatteprosent = skatteprosent;
    }

    public Person getPersonlia() {
        return personlia;
    }


    public int getArbeidstakerNummer() {
        return arbeidstakerNummer;
    }


    public int getAnsettelsesaar() {
        return ansettelsesaar;
    }


    public int getMaanedslonn() {
        return maanedslonn;
    }


    public void setMaanedslonn(int maanedslonn) {
        this.maanedslonn = maanedslonn;
    }


    public double getSkatteprosent() {
        return skatteprosent;
    }


    public void setSkatteprosent(float skatteprosent) {
        this.skatteprosent = skatteprosent;
    }


    public float getSkatteTrekk() {                       // skattetrekk per måned
        float skattefaktor = skatteprosent/100;
        return maanedslonn * skattefaktor;
    }


    public int getBruttoLonn() {
        return maanedslonn * 12;
    }


    public float getSkattAar() {
        float skattefaktor = skatteprosent / 100;
        float vanligMnd = maanedslonn * skattefaktor;
        float desember = (vanligMnd / 2);
        return ((vanligMnd * 10) + desember);
    }


    public int getAlder() {
        return aar - getPersonlia().fodselsaar;
    }


    public int aarIBedriften() {
        return aar - getAnsettelsesaar();
    }


    public boolean getLengerEnn(int antallAar) {
        return aarIBedriften() >= antallAar;
    }

    public String getFulltNavn(){
        return personlia.getEtternavn() + ", " + personlia.getFornavn();

    }
    @Override
    public String toString(){
        return "Arbeidstaker = " + personlia.getFornavn() + personlia.getEtternavn() + "\n" +
                "Arbeidstakernummer = " + arbeidstakerNummer + "\n" +
                "Ansettelsesår = " + ansettelsesaar + "\n" +
                "Månedslønn = " + maanedslonn + "\n" +
                "Skattetrekk måned = " + getSkatteTrekk() + "\n" +
                "Skattetrekk år = " + getSkattAar() + "\n";


    }

}
/*



Finn ut i hvilke av disse tilfellene at ArbTaker-objektet må samarbeide med personaliaobjektet for å løse oppgaven.

Tegn sekvensdiagram for disse operasjonene.


 */