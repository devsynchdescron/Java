package SectionTwo;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;
        do{
            System.out.println("How did this work?");
        }while(num>10);

        
            
            String uname = "";
          
            String pword ="";

        do{
            System.out.println("Enter username");
            uname = sc.nextLine();
            System.out.println("Enter password");
            pword = sc.nextLine();
            

        }while(!uname.equals("username") && !pword.equals("password"));
        System.out.println("Congratulations you logged in");

        // Lesson exercise : Learn more about loops

        // Optional : look for palindrome number problem
    }
}
