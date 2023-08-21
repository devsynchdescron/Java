package SectionOne;

public class Strings {
    public static void main(String[] args) {
       // Some useful String methods
        String firstName = "Micheal";
        String lastName = "Jordan";

        // lenght of a string
        System.out.println(firstName.length());
        
        // first character of a string
        System.out.println(firstName.charAt(0));

        // Concatenate string with another string
        System.out.println(firstName.concat(lastName));

        // Convert string to char array
        System.out.println(firstName.toCharArray());

        // Convert all characters in string to lowercase
        System.out.println(firstName.toLowerCase());

        // Convert all characters in string to uppercase
        System.out.println(firstName.toUpperCase());

        // Get class of a string
        System.out.println(firstName.getClass());

        // Repeats string count times
        System.out.println(firstName.repeat(3));



        // Lesson exercise : learn more about string methods and String class
        // Learn backslash in string

        // Optional : Learn why adding string and int types causes concatenation
        System.out.println("Micheal"+20);
        System.out.println(20 + "Micheal");
        System.out.println(20 + 10);
    }
}
