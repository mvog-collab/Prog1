
import java.util.ArrayList;

public class Meny {

  private ArrayList<Rett> retter;
  private int antRetter;


  public Meny(Rett... retter) {
    this.retter = new ArrayList<Rett>();
    for (Rett rett : retter) {
      this.retter.add(rett);
    }
  }

  public ArrayList<Rett> getRetter() {
    return retter;
  }

  public int getAntRetter() {
    return antRetter;
  }

  public double totalPris() {
    double total = 0;
    for (Rett rett : retter) {
      total += rett.getPris();
    }

    return total;
  }

  @Override

  public String toString() {
    StringBuilder menyStr = new StringBuilder();
    for (Rett rett : retter) {
      menyStr.append(rett.toString()).append("\n");
    }
    return menyStr.toString();
  }
}

