package SectionOne;

public class TypeCasting {
    public static void main(String[] args) {
        // In programming world we often need to cast data types to other data types
        // Casting data type to a smaller data type can be done manually
        // Casting data type to a bigger data type has to be done automatically

        int intNum = 10; // Here we initialized an int data type
        byte byteNum = (byte)intNum; // Here we converted an int to a byte
        System.out.println("byteNum value :"+byteNum);

        int myOtherIntNum = 20; // Here we initialized another int
        double doubleNum = myOtherIntNum; // Here we converted an int to a double
        System.out.println("doubleNum value :"+doubleNum);

        // Lesson exercise : try converting data types to other data types,
        // Especially String to int

        // Optional : learn more about Strings
    }
}
