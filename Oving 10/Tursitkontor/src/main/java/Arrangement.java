public class Arrangement {

  int nummer;
  String navn;
  String sted;
  String arrangor;
  String type;
  long tidspunkt;

  public Arrangement (int nummer, String navn, String sted, String arrangor, String type, long tidspunkt){
    this.nummer = nummer;
    this.navn = navn;
    this.sted = sted;
    this.arrangor = arrangor;
    this.type = type;
    this.tidspunkt = tidspunkt;
  }

  public int getNummer() {
    return nummer;
  }

  public String getNavn() {
    return navn;
  }

  public String getSted(){
    return sted;
  }

  public String getArrangor(){
    return type;
  }

  public String getType() {
    return type;
  }

  public long getTidspunkt() {
    return tidspunkt;
  }

  @Override
  public String toString(){
    return "Nummer: " + nummer + " Arrangement: " + navn + " Sted: " + sted +
        " Arrangert av: " + arrangor + " Type: " + type +
        " Tidspunkt i (årmåneddagklokkeslett): " + tidspunkt;
  }
}


