import java.util.ArrayList;

public class Oppgaveoversikt {
  public ArrayList<Student> studenter;

  public Oppgaveoversikt() {
    // legger til studentobjekter
    studenter = new ArrayList<>();

    Student student1 = new Student("Kåre", 15);
    Student student2 = new Student("Grete", 12);
    Student student3 = new Student("Bernt", 10);

    studenter.add(student1);
    studenter.add(student2);
    studenter.add(student3);

    int antStud = studenter.size();

    for (Student student : studenter) {
      System.out.println(student);
    }

    System.out.println("Antall studenter: " + antStud);
  }

  public int getAntallOppgaverForStudent(String name) {
    for (Student student : studenter) {
      if (student.getName().equalsIgnoreCase(name)) {
      return student.getAntOppg();
      }
    }
    return -1;
  }

  public void registerNewStudent(String name, int antOppg) {
    Student newStudent = new Student(name, antOppg);
    studenter.add(newStudent);
  }

  public boolean oktAntOppgForStudent(String name, int okning) {
    for (Student student : studenter) {
      if (student.getName().equalsIgnoreCase(name)){
        student.oktAntOppg(okning);
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (Student student : studenter) {
      result.append(student.toString()).append("\n");
    }
    return result.toString();
  }
}



