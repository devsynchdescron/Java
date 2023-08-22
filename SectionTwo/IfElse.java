package SectionTwo;

public class IfElse {
    public static void main(String[] args) {
        int age = 16;

        if(age > 18 ){
            System.out.println("Old enough to vote");
        }else{
            System.out.println("Can't vote");
        }

        boolean isHungry=false;

        if(!isHungry){
            System.out.println("I am hungry");
        }else{
            System.out.println("I am not hungry");
        }

        int ageTwo = 60;

        if(ageTwo < 18){
            System.out.println("Teenager");
        }else if(ageTwo >= 18 && ageTwo <= 29){
            System.out.println("Youngblood");
        }else if(ageTwo>29 && ageTwo < 45){
            System.out.println("Getting old");
        }else{
            System.out.println("Elder");
        }

        // Lesson exercise : look for different implementation of if-else statements
        // look for nested if-else statements

        // Optional : Learn UML diagram 
        // draw a UML diagram for your if-else statement
    }
}
