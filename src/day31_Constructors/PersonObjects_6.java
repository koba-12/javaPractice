package day31_Constructors;

public class PersonObjects_6 {

    public static void main(String[] args) {

        Person_5 person1=new Person_5("daniel",'M',32);
        // setInfo methodda -alta offer1.setInfo- tarzı bir şey yazıp içine argumentleri yazıyorduk.burada direkt
        //en üstte new Persona yazdık
        System.out.println(person1);//Person{name='daniel', gender=M, age=32}

        Person_5 person2=new Person_5("kseniia",'F',28);
        System.out.println(person2);//Person{name='kseniia', gender=F, age=28}
    }
}
