package SectionThree.OOP.Inheritance;

public class Puppy extends Dog{

    public Puppy(int weight, int height) {
        super(weight, height);
        
    }

    @Override
    public String toString() {
        return "Puppy "+"[height=" + height + ", weight=" + weight + "]";
    }
    
    
}
