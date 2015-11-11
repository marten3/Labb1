import java.util.Random;

/** A class to represent the essential
 * characteristics of a human. Made for
 * the first laboration in the course
 * D1346.
 *
 * @author Mårten
 *
 */
/*
 *  I have written the code myself, but
 * the basic ideas behind the code is not in
 * any way mine. They come from the lecture
 * notes from lecture 1 and the corresponding
 * reading instructions. I also recieved tips from
 * Anton Grensjö about a problem in the lab specifications
 */
public class Human implements Comparable<Human> {
    protected int age;
    protected String name;
    protected static Random givename = new Random();
    private static String[] names = {"Mårten","Anton","Ruth","Gandalf",
            "Hanna","Johan","Lovisa","Arne","Astrid","Emma","Johannes",
            "Linda","Eomer","Eowyn","Galadriel","Boromir","Sean Bean"};

    public Human(int ageIn, String nameIn) {
        this.age = ageIn;
        this.name = nameIn;
    }
    public Human() {
        this((int) (Math.random()*100),names[givename.nextInt(names.length)]);
    }

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public String toString(){
        return "Namn: "+this.name+", ålder: "+this.age + " år.";
    }
    public int compareTo(Human that){
        return (this.age-that.getAge())*100;
    }
}