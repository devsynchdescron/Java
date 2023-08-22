package SectionTwo;


public class ForLoop {
    public static void main(String[] args) {
        
        // Here is the logic of for loop
        // We define a condition and as long as that condition is true
        // We loop through that condition that we specified.
        // Here i is initialized to 0 and as long as 
        // i is less than 5 we will print following statement
        // don't forget to increment i each time 
        // or condition will execute itself forever
        // you can examine this process by using debugging feature
        for(int i=0;i<5;i++){
            System.out.println("I am learning Java");
        }

        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+i*j );
            }
            System.out.println(" ");
        }
        
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += i;
        }
        System.out.println("sum of number from 1 to 10 : "+sum);
        
        // Lesson exercise : Look for different implementations of for loop
        // Look for different types of algorithms ex brute force
        // learn stack and heap memory and how field,static ,local variables and objects are stored

        // Optional : find all prime numbers between 1 and 100
        
    }
}
