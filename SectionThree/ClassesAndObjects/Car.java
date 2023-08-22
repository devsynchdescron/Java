package SectionThree.ClassesAndObjects;

public class Car {
    public int wheels = 4; // Car attributes
    public int doors = 4;
    public int speed = 80;

    // Car behaviour
    public void speedUp(){
        System.out.println("Car is speeding up");
    }
    public void brake(){
        System.out.println("Car is slowing down");
    }

    public String toString(){
        return "This car has "+wheels+" wheels "+doors+" doors and current speed is :"+speed;
    }


}
