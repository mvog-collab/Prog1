public class Rett {

  private final double pris;
  private final String type;
  private final String navn;
  private final String oppskrift;



  public Rett(String navn, String type, double pris, String oppskrift){
    this.type = type;
    this.pris = pris;
    this.navn = navn;
    this.oppskrift = oppskrift;

  }

  public String getNavn(){
    return navn;
  }

  public double getPris(){
    return pris;
  }

  public String getType(){
    return type;
  }

  public String getOppskrift(){
    return oppskrift;
  }

  @Override

  public String toString(){
    return "Navn: " + this.getNavn() + "\nType: " + this.getType() + "\nPris: " + this.getPris();
  }

}