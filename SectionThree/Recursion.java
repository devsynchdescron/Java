package SectionThree;

public class Recursion {
    public static void main(String[] args) {
        //Factorial calculator
        int res = multiply(6);
        System.out.println(res);
        int result = multiply(5, 10);
        System.out.println(result);
    }
    public static int multiply(int x){
        if(x>1){
            return x * multiply(x-1);
        }else{
            return 1;
        }
    }
    public static int multiply(int start,int end){
        if(end > start){
            return end * multiply(start, end-1);
        }else{
            return 1;
        }
    }
}
