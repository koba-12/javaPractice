package day34_GarbageCollectionAndAccesModifier;

import day30_CustomClass.Dog_3;
import day32_Constructors.Car_7;
import day33_Statics.Student_1;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection_1 {

    public static void main(String[] args) {

        String str="wooden spoon";//after line 8 "wooden spoon"  will be eligible for garbage collection
        str=null;
        System.out.println(str);


        Car_7 car1=new Car_7("toyota");
        car1=null;
        System.out.println(car1);


        System.out.println("-------------------------------------------------------");

        Dog_3 dog1=new Dog_3();//dog1 reference namedir
        dog1.name="lucy";

        dog1=new Dog_3();//bu şekilde dog1 i yeni bir Dog object atadım ve yeni bir köpek ismi verdim.bu da ilkini ortadan kaldırmış oldu.
        dog1.name="max";

        System.out.println(dog1);


        String language="python";
        language="java";

        System.out.println(language);//java


        System.out.println("-----------------------------------------------");

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(100);

        ArrayList<Integer>list2=list1;
        list2.addAll(Arrays.asList(200,300,400));//listleri eşitlediğimiz için iki listte de out [100,200,300,400]

        System.out.println(list1);
        System.out.println(list2);


        System.out.println("-----------------------------------------------");

        Student_1 student1=new Student_1("tahir",'M','B',220,'B');
        student1.grade='A';//bu şekilde yeni grade 'A' oldu,b gitti.

        Student_1 student2=student1;
        student2.name="ahmet";//ikisi eşitledniği için hem student1 hem student2 name i ahmet olarak değişti.

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("-------------------------------------------------------------");

        ArrayList<String>l1=new ArrayList<>();
        l1.add("java");

        ArrayList<String>l2=l1;
        l2.add("python");

        System.out.println(l1);//[java,python]-üstte dogda 2.yazdığım out olmuştu sadece,burada iise ikisi birden oldu.
        //sanırım orada tek bir name girebilşdiğimiz için.
        System.out.println(l2);//[java,python]





    }
}
