package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements_7 {

    public static void main(String[] args) {

        ArrayList<String >list=new ArrayList<>();

        list.add("java");//0
        list.add("java");//1
        list.add("java");//2
        list.add("python");//3
        list.add("c*");//4
        list.add("c*");//5
        list.add("c*");//6
        list.add("ruby");//7
        list.add("c+");//8
        list.add("c+");//9
        //unique olmasın için index numberları aynı olmalı

        System.out.println(list);//[java, java, java, python, c*, c*, c*, ruby, c+, c+]

        ArrayList<String> unique=new ArrayList<>();//unique ler için yeni bir array list yarattık

        for (String each : list) {//listi loopa soktuk
            if (list.indexOf(each)== list.lastIndexOf(each)){//bu conditiona uyan her elementi
                unique.add(each);//unique.ArrayListine eklemiş olduk--each, i yerine geçiyot lütfen unutmayalım
            }
        }
        System.out.println(unique);//[python, ruby]
    }
}
