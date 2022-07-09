package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2_11 {

    public static void main(String[] args) {

        ArrayList<String >employees=new ArrayList<>();
        employees.addAll(Arrays.asList("ahmet","david","jimmy","ali","dan","david","ahmet"));

        employees.retainAll(Arrays.asList("ahmet","david"));

        System.out.println(employees);//[ahmet, david, david, ahmet]

        System.out.println("-------------------------------------------");

        String []names={"mary","monica","mehray","musti","sümeyra","hasan","beril"};

        ArrayList<String >list=new ArrayList<>(Arrays.asList(names));

        list.removeIf(p-> p.charAt(0)=='m');//0 index nosu 'M' ye eşit olanları çıkar.

        System.out.println(list);//[sümeyra, hasan, beril]

        /*
        souttan önce aşağıdakileri yazıp arrayListi arraye de döndürebilirdik.

        names=list.toArray(new String[0]);
        sout(Arrays.toString(names))
         */







    }
}
