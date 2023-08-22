package SectionThree.OOP.ClassesAndObjects;

public class Main {
    public static void main(String[] args) {
        // We use OOP to simulate real world objects
        // and to avoid code repetition

        // Create Car object from Car class we created

        Car myCar = new Car();
        System.out.println(myCar.doors);
        System.out.println(myCar.speed);
        System.out.println(myCar.wheels);
        myCar.speedUp();
        myCar.brake();

        System.out.println(myCar.toString());

    }

    // Lesson exercise : learn more about OOP priciples

    // Optional : try to lower cars speed with methods
    // Hint : Methods with parameters should help
}
