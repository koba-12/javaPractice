package day24_CustomMethods_Return;

public class ReturnMethodPractice_3 {

    public static void main(String[] args) {

        //100-200 den max sayıyı bul

        int maxNumber=(max(100,200));
        System.out.println(maxNumber);//200

        //max sayıyı 2 ile çarp

        int multiplication=maxNumber*2;
        System.out.println("multiplication = " + multiplication);//400


    }

    public static int max(int a, int b){
        int result=0;//bak burada bir değer oluşturuyoruz.önceki taskte de(02 de)String="" yapmıştık.bu bir değer oluşturmak için

        if (a>b){
            result=a;
        }else {
            result=b;
        }
        return result;
    }
}
