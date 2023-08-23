package SectionThree.OOP.Abstraction;

public class SpeedBoat extends Vehicle{

    @Override
    public void honk() {
        System.out.println("This speed boat honks");
    }

    @Override
    public void speedUp() {
        super.speedUp();
    }
    
    
}
