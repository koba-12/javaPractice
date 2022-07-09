package day29_ArrayList;

import Utilities.StringUtility_1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod_4 {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(list);

        list.removeIf(p -> p<5);//(lambda expression)
        // bu da removeIf() methodudur.syntax i yanda gördüğümüz gibidir.5 ten küçük sayıları
        //out etmeyecek remove edecek.koşullu remove olarak düşünelim.
        System.out.println(list);//[5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]


        System.out.println("---------------------------------------------------");

        ArrayList<Integer>list2=new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(each -> each%2==0);//burada yaptığımıza göre demekki p koymak zorunlu değil başka bir ifade de koyabiliriz.

        System.out.println(list2);

        System.out.println("-----------------------------------------------");

        ArrayList<String>list3=new ArrayList<>();
        list3.addAll(Arrays.asList("java","python","javascript","c++","java","java"));

        list3.removeIf(p-> p.startsWith("j"));

        System.out.println(list3);


        System.out.println("------------------------------------------------");

        ArrayList<String>names=new ArrayList<>();
        names.addAll(Arrays.asList("anna","racecar","level","eye","java","python","cydeo"));

        names.removeIf(name-> StringUtility_1.isPalindrome(name));

        System.out.println(names);


    }
}
