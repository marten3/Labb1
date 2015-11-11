import java.util.Random;

/**
 * Created by Mårten on 2015-11-03.
 */
public class Fysiker extends Human{
    // Vi lägger till ett fält
    private int year;
    private static String[] names = {"Frippe","Fido","Fabian","Filip","Filippa",
            "Faramir","Frichoff","Faraday","Fourier","Frans","Fanny"};

    //Två konstruktorer------------------------------------------------------------------------------------------
    public Fysiker(int ageIn, String nameIn, int yearIn){
        if(yearIn>=1932 && yearIn<=2013 && ageIn+yearIn-2015>= 15){
            this.age = ageIn;
            this.name = nameIn;
            this.year = yearIn;
        }else{
            throw new IllegalArgumentException("Not possible to create Fysiker with param: age "+ageIn +", year "+yearIn +".");
            /*
            this.year = (int) (Math.random()*81)+1932;
            this.age = 2015+18-this.year;
            this.name = nameIn;
            */
        }
    }
    public Fysiker(){
        // this((int) (Math.random()*100),names[givename.nextInt(names.length)],((int) (Math.random()*81))+1932);
        this.year = this.randomYear();
        this.age = this.randomAge(this.year);
        this.name = names[givename.nextInt(names.length)];
    }
    //------------------------------------------------------------------------------------------------------------
    public String toString(){
        String fstring = String.format("%02d",this.getYear()%100);
        return "Namn: "+this.getName() + ", ålder: " + this.getAge() + " år, tillhör F-" + fstring +".";
    }
    public int getYear(){
        return this.year;
    }
    public int compareTo(Human that){
        if(that instanceof Fysiker && this.getAge() == that.getAge()){
            int number = ((Fysiker) this).getYear()-((Fysiker) that).getYear();
        }
        return (this.age-that.getAge())*100;
    }
    private int randomYear(){
        return (int) (Math.random()*81+1932);
    }
    private int randomAge(int year){
        int lowerbound = 15+2015-year;
        int upperbound = 100;
        int size = upperbound-lowerbound;
        int age = (int) (Math.random()*size+lowerbound);
        return age;
    }
}
