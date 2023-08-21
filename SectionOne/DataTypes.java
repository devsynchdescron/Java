package SectionOne;

public class DataTypes {
    public static void main(String[] args) {

        // Data type variable name = value
        // byte byteNum = 127
        // Data types are divided into 2 sections: Primitive types and Reference types

        // There are 8 primitive data types in Java
        // Here we assign values to variables with data types
        // These values that we assign are stored in RAM so that we can access them later
        byte byteNum = 127; 
        short shortNum = -100;
        int intNum = 15;
        long longNum = 12353L;
        float floatNum = 45.3F;
        double doubleNum = 215.642;
        boolean booleanFlag = true;
        char charVar = 'T';

        // String is a reference data type
        String stringVar = "Hello";

        System.out.println("byteNum value :"+byteNum);
        System.out.println("shortNum value :"+shortNum);
        System.out.println("intNum value :"+intNum);
        System.out.println("longNum value :"+longNum);
        System.out.println("floatNum value :"+floatNum);
        System.out.println("doubleNum value :"+doubleNum);
        System.out.println("booleanFlag value :"+booleanFlag);
        System.out.println("charVar value :"+charVar);
        System.out.println("stringVar value :"+stringVar);

        System.out.println();
        // Variables stores values that we assign to them
        // Let's take a look at the range of the data types
        System.out.println("**********************");
        System.out.println();

        System.out.println("Minimum value a byte can hold :"+Byte.MIN_VALUE+" Maximum :"+Byte.MAX_VALUE+" Size in bits :"+Byte.SIZE);
        System.out.println("Minimum value a short can hold :"+Short.MIN_VALUE+" Maximum :"+Short.MAX_VALUE+" Size in bits :"+Short.SIZE);
        System.out.println("Minimum value a int can hold :"+Integer.MIN_VALUE+" Maximum :"+Integer.MAX_VALUE+" Size in bits :"+Integer.SIZE);
        System.out.println("Minimum value a long can hold :"+Long.MIN_VALUE+" Maximum :"+Long.MAX_VALUE+" Size in bits :"+Long.SIZE);
        System.out.println("Minimum value a float can hold :"+Float.MIN_VALUE+" Maximum :"+Float.MAX_VALUE+" Size in bits :"+Float.SIZE);
        System.out.println("Minimum value a double can hold :"+Double.MIN_VALUE+" Maximum :"+Double.MAX_VALUE+" Size in bits :"+Double.SIZE);
        System.out.println("Boolean types can hold only true or false");
        System.out.println("Minimum value a char can hold :"+Character.MIN_VALUE+" Maximum :"+Character.MAX_VALUE+" Size in bits :"+Character.SIZE);
        
        // If we try to assign a value to a variable that exceeds that variables data types minimum or maximum value, compiler will throw error
        // Example : try to assign -130 to a variable with byte data type
        
        // Lessons exercise : Learn JDK,JRE and JVM
        // This way you will understand how the program executes.

        /*  Optional : Learn bytes, bits and binary system.
        This will give you a better idea of how 2 to the power of 8 is equal to 128 and
        how does it affect the size and range of data types.
        Hint : Look for the min,max and size of byte data type and other types aswell.

        */

        
    }
}
