public class KlientProgram {
  public static void main(String[] args){

        Rett rett1 = new Rett("Biff", "Hovedrett", 229.90 , "Steker den til den er medium rå med smør");
        Rett rett2 = new Rett("Rabarbara suppe", "Dessert", 110, "Knuse rabarbara i blender og legge to 2 ss sukker");
        Rett rett3 = new Rett("Grønnsakssuppe", "Forrett", 89.90, "1 Buljong blandet med grønnsaker");
        Rett rett4 = new Rett("Laks", "Hovedrett", 190, "Stekes på ildfast form i 20 min med olivenolje og div");
        Rett rett5 = new Rett("Is med jordbær", "Dessert", 100, " 1 stor skje vaniljeis med jordbær");
        Rett rett6 = new Rett("Brød med aioli", "Forrett", 80, "Fersk baguett med aioli laget med olje");
        Rett rett7 = new Rett("Andebryst", "Hovedrett", 320.90, "Aner ikke åssen man lager det men vi later som");
        Rett rett8 = new Rett("Tilslørte bondepiker", "Dessert", 110, "Knust kavring med eplemost og krem");
        Rett rett9 = new Rett("Nachos", "Forrett", 60, "Nachos servert med salsa og guakamole og cheddardip");
        Rett rett10 = new Rett("Tikka", "Hovedrett", 300, "Hvordan lage tikka");

        Meny meny1 = new Meny(rett1, rett7, rett2, rett8, rett6);
        Meny meny2 = new Meny(rett1, rett2, rett3, rett4, rett5);
        Meny meny3 = new Meny(rett9, rett8, rett7, rett6, rett5, rett1);
        Meny meny4 = new Meny(rett1, rett2, rett3);

        MenyRegister register = new MenyRegister(meny1, meny2, meny3);


        //System.out.println(register.getMenyer());
        System.out.println(register.finnRett("Rabarbara Suppe"));
        System.out.println(register.retterEnType("dessert"));
        register.nyMeny(meny4);
        System.out.println(register.getMenyer());
        register.nyRett(rett10, meny4);
        System.out.println(meny4.toString());

      }
    }