package SectionTwo;



public class WhileLoop {
    public static void main(String[] args) {
        
        boolean isTrue = true;
        int num = 1;
        // Execute this block of code as long as condition is true
        
        while(isTrue){
            
            System.out.println("Still in the loop");
            if(num == 5){
                break;
            }
            num++;

        }
        System.out.println("Out of the loop");

      
        
        int i = 10;              
        while(i>=-5){
            System.out.println(Math.pow(2, i));
            i--;
        }
        
        System.out.println("Out of the loop");


    }
}
