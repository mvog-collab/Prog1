import java.util.HashSet;
import java.util.ArrayList;

public class MenyRegister {

  private ArrayList<Meny> menyer;


  public MenyRegister(Meny... menyer){
    this.menyer = new ArrayList<Meny>();
    for (Meny meny : menyer){
      this.menyer.add(meny);
    }


  }

  public String getMenyer(){
    StringBuilder alleMenyer = new StringBuilder();
    for (Meny meny : menyer){
      alleMenyer.append(meny.toString()).append("\n");
    }
    return alleMenyer.toString();
  }


  public String nyRett(Rett rett, Meny meny){
    meny.getRetter().add(rett);
    return meny.toString();
  }

  public String finnRett(String navn){
    for (Meny meny : menyer){
      for (Rett rett : meny.getRetter()){
        if (rett.getNavn().equalsIgnoreCase(navn)){
          return rett.toString();
        }
      }
    }
    return "Ingen retter funnet.";
  }

  public String retterEnType(String InputType){
    StringBuilder avTypen = new StringBuilder();
    HashSet<Rett> kunEnGang = new HashSet<>();

    for (Meny meny : menyer){
      for (Rett rett : meny.getRetter()){
        if (rett.getType().equalsIgnoreCase(InputType)){
          kunEnGang.add(rett);
        }
      }
    }

    for (Rett rett : kunEnGang){
      avTypen.append(rett.toString()).append("\n");
    }
    return avTypen.toString();
  }

  public void nyMeny(Meny nyMeny){
    menyer.add(nyMeny);
  }

  public String menyerMedPris(double prislav, double prishoy){
    StringBuilder resultat = new StringBuilder();
    for (Meny meny : menyer){
      if (meny.totalPris() >= prislav && meny.totalPris() <= prishoy){
        resultat.append(meny.toString()).append("\n");
      }
    }
    return resultat.toString();

  }

}