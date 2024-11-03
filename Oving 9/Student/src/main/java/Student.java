public class Student {
  private final String name;
  private int antOppg;

  public Student(String name, int antOppg) {
    this.name = name;
    this.antOppg = antOppg;
  }

  public String getName() {
    return name;
  }

  public int getAntOppg() {
    return antOppg;
  }

  public void oktAntOppg(int okning){
    antOppg += okning;
  }

  @Override
  public String toString(){
      return "Studenten " + name + " har gjort " + antOppg + " oppgaver";
    }
}



