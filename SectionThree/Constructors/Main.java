package SectionThree.Constructors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Every computer object shares this value :"+Computer.SCREENSIZE);
        Computer comp = new Computer();
        System.out.println(comp.toString());
        

        Computer comp2 = new Computer(512, true, "Lenovo v16", 16.800);
        System.out.println(comp2.toString());
        
    }

    // Lesson exercise : Learn about no arg constructors and constructors with args
    // learn this and final keywords
    

    //Optional : learn constructor chaining
    // learn super keyword
}
