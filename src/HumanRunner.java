import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * Created by Mårten on 2015-11-03.
 */
public class HumanRunner {

    public static void main(String[] args) {
        // Creates a human and prints its age and name.
        Fysiker mårten = new Fysiker(22, "Mårten", 2013);
        Fysiker anton = new Fysiker();

        System.out.println(anton.getName() +
                " är " + anton.getAge() + " år gammal.");
        System.out.println(anton);
        System.out.println("\nDetta program skrevs av person 199303180070 med följande egenskaper "
                + "\n" + mårten + "\n \n");

        // Del 3, skapa en massa folk --------------------------------------------------------------------------------
        int n = 15;
        Human[] population = new Human[n];
        for (int i = 0; i < n; i++) {
            population[i] = new Human();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(population[i].toString());
        }
        // Del 4, skapa ännu fler folk -------------------------------------------------------------------------------
        System.out.println("\n");
        Fysiker[] nerds = new Fysiker[n];

        for (int i = 0; i < n; i++) {
            nerds[i] = new Fysiker();
        }
        for (Fysiker nerd : nerds) {
            System.out.println(nerd);
        }

        // Del 4.5, röda linjen. Vanliga människor blandas med fysiker -----------------------------------------------
        System.out.println("\n");
        n = 5;
        Human[] subwaypeople = new Human[2 * n];
        for (int i = 0; i < n; i++) {
            subwaypeople[2 * i] = new Human();
            subwaypeople[2 * i + 1] = new Fysiker();
        }
        for (Human subwayperson : subwaypeople) {
            System.out.println(subwayperson);
        }

        System.out.println("\n");
        //Del 5, Jämför människovärde (ålder) ------------------------------------------------------------------------
        Human[] twopeople = {new Human(), new Human()};
        Arrays.sort(twopeople);
         System.out.println("Det här är " + twopeople[0].getName() + ", som är "
                 + (twopeople[1].getAge()-twopeople[0].getAge()) + " år yngre än "
                 + twopeople[1].getName() + ", som är "
                 + twopeople[1].getAge() + " år gammal. \n");
        //Del 5.3 Jämför fysikervärde --------------------------------------------------------------------------------
        Human[] twonerds = {new Fysiker(), new Fysiker()};
        Arrays.sort(twonerds);
        System.out.println("Det här är " + twonerds[0].getName() + ", som är "
                + (twonerds[1].getAge()-twonerds[0].getAge()) + " år yngre än "
                + twonerds[1].getName() + ", som är "
                + twonerds[1].getAge() + " år gammal. \n");
        //Del 5.4 Skapa massa skumma typer ---------------------------------------------------------------------------
        // Vi har redan utfört den första delen i 4.5.
        Arrays.sort(subwaypeople);
        for(Human subwayperson : subwaypeople){
            System.out.println(subwayperson);
        }

        // C-delen: Ta in strängar som argument ----------------------------------------------------------------------
        System.out.println("\nSista delen nu!---------------------");
        int i = 0;
        ArrayList<Human> folklist = new ArrayList<Human>();
        while(i < args.length){
            if(args[i].equals("-F")){
                int thisyear = Integer.parseInt(args[i+3])+1900;
                if (thisyear <= 1913){
                    thisyear = thisyear+100;
                }
                folklist.add(new Fysiker(Integer.parseInt(args[i+2]),args[i+1],thisyear));
                i = i+4;
            }else if(args[i].equals("-H")){
                folklist.add(new Human(Integer.parseInt(args[i+2]),args[i+1]));
                i = i+3;
            }else{
                System.out.println("Felaktigt indata har upptäckts");
                i++;
            }
        }
        for(Human folk : folklist){
            System.out.println(folk);
        }
    }
}