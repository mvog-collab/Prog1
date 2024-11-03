public class Eindom {

  int kommuneNummer;
  String kommuneNavn;
  int gnr;
  int bnr;
  String name;
  double area;
  String nameOfOwner;


  public Eindom(int kommuneNummer, String kommuneNavn, int gnr, int bnr, String name, double area,
      String nameOfOwner) {
    this.kommuneNummer = kommuneNummer;
    this.kommuneNavn = kommuneNavn;
    this.gnr = gnr;
    this.bnr = bnr;
    this.name = name;
    this.area = area;
    this.nameOfOwner = nameOfOwner;
  }
  
  public int getKommunenummer() {
  return kommuneNummer;
  }
  public String getKommuneNavn() {
    return kommuneNavn;
  }
  public int getGnr() {
    return gnr;
  }
  public int getBnr() {
    return bnr;
  }
  public String getName() {
    return name;
  }
  public double getArea() {
    return area;
  }
  public String getNameOfOwner() {
    return nameOfOwner;
  }
  
  @Override
  public String toString() {
    return kommuneNummer + "-" + gnr + "-" + bnr;
  }
}

  

 

  