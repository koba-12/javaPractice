package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice_5 {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);//[10,20,30,40,50]

        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i) * 2);//"i" ile "i" nin 2katı yer değiştirecek
        }
        System.out.println(list);//[20,40,60,80,100]
    }
}
