package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_3 {

    public static void main(String[] args) {

        /*
        Bulk Operations: argument MUST be a collection type
        addAll(CollectionType): adds collection of values to the arrayList
        ek:Arrays: asList(array of values) ===> returns the array as collectionType-arrayi Collection type a döndürür
        //bunu ekledi notlara.aşağıda kullanacağız.
         */

        ArrayList<Integer>list=new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7));//arrayi collectiona döndürmüş oldu.-örneğin buraya direkt addAll yazıp
//sonra parantez içine sayıları yazsaydık (c:1,2,3,4,5,6,7) şeklinde olurdu ve compile error verirdi.
        System.out.println(list);//[1, 2, 3, 4, 5, 6, 7]

        /*
        removeAll(CollectionType): removes all the matching elements from the arraylist
        removeAll:aynı şekilde ama bu sefer toplu çıkarma yapar,yazılanları çıkarır
         */

        list.removeAll(Arrays.asList(3,5,7));
        System.out.println(list);//[1, 2, 4, 6]


        System.out.println("----------------------------------------------");

        /*
        retainAll(CollectionType): removes all the non-matching elements from the arraylist
        removesallda yazılanlar remove ediliyordu.bu retainAllda da yazılanlar korunuyor kalanlar remove ediliyor.
        zaten kelime anlamı olarak retain korumak,saklamak gibi anlamlara geliyor.
         */

        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(100,200,300,400,500,600,100,200,300,700,800,900));
        numbers.retainAll(Arrays.asList(100,200,300));//bu yazdıklarım korundu.diğerleri remove dildi

        System.out.println(numbers);//[100, 200, 300, 100, 200, 300]


        System.out.println("----------------------------------------------------");

        ArrayList<String> jobTitles=new ArrayList<>();
        jobTitles.addAll(Arrays.asList("qa","sdet","developer","qa","sdet","scrum master","ba","ba"));

        jobTitles.retainAll(Arrays.asList("qa","sdet"));

        System.out.println(jobTitles);//[qa, sdet, qa, sdet]

        System.out.println("-------------------------------------------------------");

        /*
            containsAll(CollectionType): checks if all the elements are contained in the arraylist
            çoklu içerir alabiliyoruz
         */

        ArrayList<Integer>nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));

        boolean r1=nums.contains(10);
        boolean r2=nums.contains(2)&&nums.contains(5)&&nums.contains(10);//normal contains ile tek tek yazmak gerek
        boolean r3=nums.containsAll(Arrays.asList(2,5,10));//ama containsall ile tek kümede toplayabiliriz
        System.out.println("r1 = " + r1);//true
        System.out.println("r2 = " + r2);//true
        System.out.println("r3 = " + r3);


        System.out.println("----------------------------------------------");

        //as list:array i collectiona döndürmek için kullanılır

        String []names={"bright","miguel","irfan","andrea"};

        ArrayList<String>nameList=new ArrayList<>(Arrays.asList(names));
        //nameList.addAll(Arrays.asList(names));-bu şekilde yazılabilir ama bunun da kısayolu üstte yazdığım gibi yazmak

        System.out.println(nameList);


        System.out.println("----------------------------------------");

        Integer[] arr={1,2,3,4,5,6,7,8,9};//dikkat edelim int değil Integer

        ArrayList<Integer>list2=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);


        System.out.println("-----------------------------------------------");

        int[]arr2={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer>list3=new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list3 = " + list3);//alttaki return method sayesinde int arrayini(primitive) döndürdük
    }

    public static ArrayList<Integer> convertArrayToArrayList(int[]array){//primitive olan int Array ini
        // collectiona döndürmek için böyle yaptık
        ArrayList<Integer>list=new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
