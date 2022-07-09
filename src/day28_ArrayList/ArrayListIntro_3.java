package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro_3 {

    /*
    Data Structure:
Array: size is fixed, supports both primitives & non primitives
Collection: size is dynamic, does not support primitives
ArrayList: part of the collection. internally uses the array

    objectlerti saklamamıza izin verir
    java.util packagede sunulmuştur
    Boyut otomatik olarak ayarlanır (ekleme ve kaldırma işlevlerine sahiptir)
    primitives i desteklemez
    pdf deki tabloya da göz at mutlaka
    ayrıca bunun methodları da var
    import.java.util.ArrayList;

    Syntax:
    buraya bir data type yazmak zorunlu  //  burası ise optional
    ArrayList<data type> name=new ArrayLİst<data type>();
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();//primitives olamaz.ikinci <> içine yazmak optionaldir.böyle durması makbuldür.
        ArrayList<String> names= new ArrayList<>();

        System.out.println(numbers);
        System.out.println(names);
    }
}
