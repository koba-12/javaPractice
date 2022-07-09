package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects_4 {

    public static void main(String[] args) {

        Dog_3 dog1=new Dog_3();//dog classta yazılanlar sayesinde yazdık
        dog1.name="lucy";
        dog1.breed="husky";
        dog1.age=5;
        dog1.gender='F';
        dog1.size="small";
        dog1.color="white";


        Dog_3 dog2=new Dog_3();//burada Dog_3 yazmasının sebebi o classtan çağırmam
        dog2.name="ace";//eğer bu detayları yazmayıp sadece bir üstte yazdığımı yazsam dog1 deki gibi out verirdi yine
        //hashcode olmazdı ama detaylar yazmazdı "husky, ace, 8" vs gibi hepsinde null yazardı.(tabi soutu yazdığım takdirde)
        dog2.breed="husky";
        dog2.age=8;
        dog2.gender='M';
        dog2.size="big";
        dog2.color="black";



        Dog_3 dog3 = new Dog_3();
        dog3.setInfo("jack","german shephard",2,'M',"large","black");
        //dog3 ün özelliklerini setInfoda(Dog classta) yazdığım için üstteki gibi yapabildim.


        System.out.println(dog1);//dog classtaki toString method olmazsa burası hashcode verir
        //dog classta yazdığım shortcutı da bulunan toString method sayesinde burası normal şekilde out verdi.
        //Dog_3{name='lucy', breed='husky', age=5, gender=F, size='small', color='white'}

        System.out.println(dog2);
        //Dog_3{name='ace', breed='husky', age=8, gender=M, size='big', color='black'}

        System.out.println(dog3);//Dog_3{name='jack', breed='german shephard', age=2, gender=M, size='large', color='black'}


        dog1.eat();

        dog2.bark();//yine Dog classtan çağırdık.tüm bu yazdıklarımın toplamı bir custom class olmuş oldu

        Dog_3 dog4=new Dog_3();
        dog4.setInfo("bullet","labrador",3,'M',"extra large","yellow");

        Dog_3 dog5=new Dog_3();
        dog5.setInfo("sully","pitbull",6,'M',"large","black");

        System.out.println("----------------------------------------------------");

        Dog_3[]dogs={dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog_3>femaleDogs=new ArrayList<>();
        ArrayList<Dog_3>maleDogs=new ArrayList<>();
        
    }
}
