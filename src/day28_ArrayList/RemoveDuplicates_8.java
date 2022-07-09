package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates_8 {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result=new ArrayList<>();

        for (Integer each : list) {//listi loopladık
            if (result.contains(each)){//eğer each yani loop daha önce tekrarlanan bir şeyi içerirse continue yapıyor
                continue;
            }
            result.add(each);//sonucu da resulte ekliyor
        }
        System.out.println(result);//[10, 20, 30]
    }
}
