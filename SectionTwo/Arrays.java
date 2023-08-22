package SectionTwo;



public class Arrays {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        String[] array2 = new String[5];
        array2[0] = "Monday";
        array2[1] = "Tuesday";
        array2[2] = "Wednesday";
        array2[3] = "Thursday";
        array2[4] = "Friday";

        for(int i : array){
            System.out.println(i);
        }
        for(String i : array2){
            System.out.println(i);
        }
        
        int[] array3 = array.clone();
        for(int i : array3){
            System.out.println(i);
        }
        System.out.println(array.length);
        System.out.println(java.util.Arrays.toString(array2));
        System.out.println(array.equals(array3));
        System.out.println(array.equals(array));

        int[][] arr = {{1,2,3},{4,5,6}};
        System.out.println(java.util.Arrays.deepToString(arr));

    
    }
}
