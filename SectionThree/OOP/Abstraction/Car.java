package SectionThree.OOP.Abstraction;

public class Car extends Vehicle{

    @Override
    public void honk() {
        System.out.println("This car honks");
    }

    @Override
    public void speedUp() {
        super.speedUp();
    }
    
    
}
