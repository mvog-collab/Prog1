import java.util.ArrayList;
import java.util.List;

public class EindomRegister {

  private List<Eindom> eindommer;

  public EindomRegister() {
    this.eindommer = new ArrayList<>();
  }

  public void registrerEindom(Eindom eindom) {
    eindommer.add(eindom);
  }

  public void fjernEindom(Eindom eindom) {
    eindommer.remove(eindom);
  }

  public void skrivUtAlleEindommer() {
    for (Eindom eindom : eindommer) {
      System.out.println(eindom.toString());
    }
  }

  public int antallEindommer() {
    return eindommer.size();
  }

  public List<Eindom> finnEindomMedNummerGnrBnr(int komunneNummer, int gnr, int bnr) {
    List<Eindom> resultat = new ArrayList<>();
    for (Eindom eindom : eindommer) {
      if (eindom.getKommunenummer() == komunneNummer && eindom.getGnr() == gnr
          && eindom.getBnr() == bnr) {
        resultat.add(eindom);
      }
    }
    return resultat;
  }

  public List<Eindom> finnEindomMedNummer(int komunneNummer) {
    List<Eindom> resultat = new ArrayList<>();
    for (Eindom eindom : eindommer) {
      if (eindom.getKommunenummer() == komunneNummer) {
        resultat.add(eindom);
      }
    }
    return resultat;
  }

  public double finnGjennomsnittsAreal(){
    double summer = 0;
    for (Eindom eindom : eindommer){
      if (eindommer.isEmpty()){
        return 0;
      }
      summer += eindom.getArea();
    }
    return summer/antallEindommer();
  }
}

