
public class Person{

    final String fornavn;
    final String etternavn;
    final int fodselsaar;

    public Person(String fornavn, String etternavn, int fodselsaar){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fodselsaar = fodselsaar;
    }

    public String getFornavn() {
        return fornavn;
    }
    public String getEtternavn() {
        return etternavn;
    }
    public int getFodselsaar() {
        return fodselsaar;
    }
}


