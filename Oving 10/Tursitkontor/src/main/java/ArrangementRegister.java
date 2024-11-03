import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrangementRegister {
  static ArrayList<Arrangement> arrangementer;

  public ArrangementRegister() {
    this.arrangementer = new ArrayList<>();
  }

  public void registerNewArrangement(Arrangement arrangement) {
    arrangementer.add(arrangement);
  }

  public List<Arrangement> bestemtSted(String sted){
    List<Arrangement> resultat = new ArrayList<>();
    for (Arrangement arrangement : arrangementer) {
      if (arrangement.getSted().equalsIgnoreCase(sted)){
        resultat.add(arrangement);
      }
    }
    return resultat;
  }

  public List<Arrangement> finnArrangementerPaTidspunkt(long tidspunkt){
    List<Arrangement> resultat = new ArrayList<>();
    for (Arrangement arrangement : arrangementer) {
      long datoAvTidspunkt = arrangement.getTidspunkt() / 10000;   // ignorere klokkeslett de 4 siste sifrene
      if (datoAvTidspunkt == tidspunkt) {
        resultat.add(arrangement);
      }
    }
    return resultat;
  }

  public List<Arrangement> finnArrangementInnenforTidspunkt(long startTidspunkt, long sluttTidspunkt){
    List<Arrangement> resultat = new ArrayList<>();
    for (Arrangement arrangement : arrangementer) {
      if (arrangement.getTidspunkt() >= startTidspunkt && arrangement.getTidspunkt() <= sluttTidspunkt) {
        resultat.add(arrangement);
      }
    }
    return resultat;
  }

  public void sorterArrangementerEtterSted(){
    arrangementer.sort(Comparator.comparing(Arrangement::getSted));
  }

  public void sorterArrangementerEtterType(){
    arrangementer.sort(Comparator.comparing(Arrangement::getType));
  }
  public void sorterArrangementerEtterTidspunkt(){
    arrangementer.sort(Comparator.comparing(Arrangement::getTidspunkt));
  }

  public void skrivUtAlleArrangementer(){
    for (Arrangement arrangement : arrangementer){
      System.out.println(arrangement);
    }
  }

  public void skrivUt(List<Arrangement> arrangementList){
    for (Arrangement arrangement : arrangementList) {
      System.out.println(arrangement);
    }

  }
}
