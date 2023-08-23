package SectionThree.OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.honk();
        car.speedUp();

        SpeedBoat speedBoat = new SpeedBoat();
        speedBoat.honk();
        speedBoat.speedUp();
    }
}
