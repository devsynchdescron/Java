package SectionThree;

public class Methods {
    // main is a method
    public static void main(String[] args) {
        System.out.println(add(4, 5));
        System.out.println(add(12, 27));
        greet("Micheal");
        salute("Micheal", "Jordan");
        System.out.println(add(1.2, 2.3));
    }
    public static int add(int x,int y){
        return x+y;
    }
    public static void greet(String name){
        System.out.println("Hello "+name);
    }
    public static String greet2(String name){
        return name;
    }
    public static void salute(String name,String lastName){
        System.out.println(greet2(name)+" "+lastName);
    }
    public static double add(double x,double y){
        return x+y;
    }

    // Lesson exercise : learn overloaded methods

    // Optional : Learn more about classes and methods
}
