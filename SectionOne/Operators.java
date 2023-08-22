package SectionOne;

public class Operators {
    public static void main(String[] args) {
        // Addition subtraction multiplication division
        System.out.println("Add :"+3+3);
        System.out.println("Subtract :"+ (56-21));
        System.out.println("Multiply :"+4*12);
        System.out.println("Divide :"+ 13/5);

        // Modulus
        System.out.println("Mod :"+ 12%7);

        // || means or
        System.out.println("false or true :"+(false || true));

        // && means and
        System.out.println("true and false :"+(true && false));

        // == checks if 2 variables are equal
        // = is assignment operator do not confuse it with == 
        System.out.println("does 6 equal to 5 :"+(6 == 5));

        // ! is used to revert the condition
        System.out.println("reverse of false :"+!false);

        int num = 5; // initialize an int with value 5
        num *= 5; // multiply num with 5 (shorter version)
        num = num * 5; // multiply num with 5 (longer version)


        // Lesson exercise : try and make operations with float and double types for more precision
        // We divided 13 with 5 and got 2 for result which is not correct.
        // Try declaring 2 doubles with values 13 and 5 and divide them.Compare the result with int division.

        // Optional : learn more about bitwise operators



    }
}
