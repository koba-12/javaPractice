package day41_Exceptions;

public class FinallyBlock_4 {

    public static void main(String[] args) {

        int[]arr={1,2,3};

        try {
            System.out.println(arr[10]);
            System.out.println("try block");
        }catch (RuntimeException e){
            System.out.println("catch block");
            e.printStackTrace();
            //System.exit(0);--mesela buraya bunu yazsak finally block out olmaz.
        }finally {
            System.out.println("finally block");
        }
//catch block ve finally block out olur
    }
}
