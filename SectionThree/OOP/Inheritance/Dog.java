package SectionThree.OOP.Inheritance;

public class Dog {
    final public static boolean COLORBLIND = true;
    public int height;
    public int weight;

    public Dog(int weight,int height){
        this.weight = weight;
        this.height=height;
    }

    public void run(){
        System.out.println("Dog is running");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("Dog is barking");
    }

    @Override
    public String toString() {
        return "Dog [height=" + height + ", weight=" + weight + "]";
    }
    
}
