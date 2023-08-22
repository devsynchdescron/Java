package SectionThree.OOP.Constructors;

public class Computer {
    final public static String SCREENSIZE = "17 inch";
    public int ram;
    public boolean isColored;
    public String name;
    public double price;

    public Computer(){// No arg Constructor
    }
    public Computer(int ram,boolean isColored,String name,double price){ // Constructor with args
        this.ram = ram;
        this.isColored=isColored;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Computer [ram=" + ram + ", isColored=" + isColored + ", name=" + name + ", price=" + price + "]";
    }

    

    
}
