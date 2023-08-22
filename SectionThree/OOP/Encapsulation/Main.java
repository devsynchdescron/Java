package SectionThree.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("1", "Coffee Machine", 50);
        System.out.println(product.toString());
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getClass());

        product.setId("5");
        product.setName("Carpet");
        product.setPrice(200.12);
        System.out.println(product.toString());

    }

    // Lesson exercise : learn the need of encapsulation
    // Learn about getters and setters

    
}
