package day41_Exceptions;

import day39_EncapsulationAndInheritanceRecap.cydeoTask.Student_6;

import java.io.FileInputStream;

public class CheckedVsUnchecked_1 {

    public static void main(String[] args) {

        //unchecked

        int a=10;
        int b=0;

        //System.out.println(a/b);
//compile time sanırım yazdığımız sırada ekranda görünen alan.runtime da run yapınca çıkan print ekranındaki alan.
//bu işlemde 10,0 a bölünemeyeceği için runtimeda "ArithmeticException" hatası verdi.yanında da/by zero yazıyor
//0 a bölünemez anlamında sanırım.



        char[]characters={'A','B','C'};
        //System.out.println(characters[99]);//yine aynı şekilde runtime error.
//99 characters elementin out of bounds unda olduğu için hata verir.



        Student_6 student=null;
        //System.out.println(student.getName());studenta null atadığımız için nullPointerException
        //student.study();



        String str="wooden spoon";
        str=null;
        //System.out.println(str.toUpperCase());


            //checked exception

        System.out.println("hello");
        //Thread.sleep(3000);//kelimenin altında kırmızı çizgi çıkınca da checked exception oluyor.(comp err)
        System.out.println("cydeo");

        //FileInputStream file=new FileInputStream("path of the file");--aynı şekilde




    }
}
