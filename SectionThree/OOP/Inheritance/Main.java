package SectionThree.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(60, 100);
        System.out.println(dog.toString());
        dog.bark();
        Puppy puppy = new Puppy(15, 20);
        System.out.println(puppy.toString());
        puppy.bark();
    }

    // Lesson exercise : learn more about the use of toString method and how to write it
    // Learn to generate toString method and constructors with arguments from IDE 

    // Optional : Learn more about 4 OOP principles
}
