package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods_4 {

    public static void main(String[] args) {


//öncelikle şunu belirteyim tüm methodlar day28 pdf inde liste halinde yazıyor
        /*
        2 türü vardır bunun.
        add(data):adds the data after the last index of the arrayList
        add(index,data):inserts the data at the given index(
         */

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);//o index
        numbers.add(20);//1
        numbers.add(30);//2-aşağıda 25 i ekledikten sonraki yeni indexi3
        numbers.add(40);//3-4
        numbers.add(50);//4-5

        numbers.add(2,25);//artık yeni 2 index numberlı sayımız 25 olur.ve üstte yazdığım index numaraları da 1 kayar.
        //bunu zaten önerilerden de seçerken 2 farklı add()method var belli

        System.out.println(numbers);//[10,20,25,30,40,50]

        //size(): toplam size(element sayısını) ı verir.--returbs the total number of elements
        System.out.println(numbers.size());//6-toplam size

        int lastIndex=numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);//7

        System.out.println("-------------------------------------------");

        /*
        get(index): returns the element at the given index
        index numarasını veriyor
        charAt() methoda benziyor
         */

        int num=numbers.get(3);
        System.out.println("num = " + num);

        //örn şu şekilde kullanılabilir.

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("-------------------------------------------");

        /*
        set(index,Data):replaces the element at the given index with the new element
        replace() nethoda benzer.yer değiştirme yapar.
         */

        ArrayList<String>list=new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("ruby");

        list.set(2,"javaScript");//değiştirmek istediğimin index nosu ve yerine yazmak istediğpim yeni element

        System.out.println(list);

        System.out.println("-------------------------------------------------");

        /*
        bunun da 2 türü vardır.
        remove(int index):bir elementi çıkarmak için kullanılır
        remove(int index):removes the element at the given index

        remove(Object):removes the given object from arrayList
        remove(object):bu sadece object i remove ediyor.yani index no vs yazmıyoruz.onun yerine direkt
        örn: "altay" yazıyoruz.(bu tarz quote içinde yazanlar da object oluyor zaten).özellikle aynı object birden fazla varsa
        örn:aynı arrayListte 8 tane ferdi yazıyorsa tek tek index numberlarla uğraşmak yerine sadece object olarak"ferdi" yazarak
        remove yapabiliriz.son olarak int index sayılar vs gibi primitives şeyler için kullanılır.object ise yazı olan şeyler için.
        returns boolean?

         */

        ArrayList<String >employees=new ArrayList<>();

        employees.add("altay");
        employees.add("attila");
        employees.add("min jae");
        employees.add("ferdi");
        employees.add("bright");
        employees.add("arda");
        employees.add("mergim");

        System.out.println(employees);//[altay, attila, min jae, ferdi, bright, arda, mergim]

        employees.remove(0);//0 index no lu elementi yani altay ı çıkaracak
        System.out.println(employees);

        employees.remove(0);//geriye kalanlarda artık 0 index no attila olduğu için attila yı çıkarır.
        System.out.println(employees);

        employees.remove(employees.size()-1);//bu sonuncu elementi verir.sanırım sadece element muhabbetlerinde -1 sonuncuyu veriyor.
        System.out.println(employees);


        employees.remove("bright");//zaten önerilerde de remove(object o) şeklinde yazıyor
        System.out.println(employees);

        employees.remove("ferdi");
        System.out.println(employees);


    }
}
