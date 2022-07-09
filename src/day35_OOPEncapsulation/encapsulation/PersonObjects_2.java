package day35_OOPEncapsulation.encapsulation;

public class PersonObjects_2 {

    public static void main(String[] args) {

        Person p1=new Person();
        //p1.name="daniel";-bunlar private olduğu için comp err verir.
        //p1.age=28;

        p1.setName("daniel");
        p1.setAge(28);

        //System.out.println(p1.name+" : "+age);-yine bu da comp err

        System.out.println(p1.getName()+" : "+ p1.getAge());
//bir de sebebini tam anlayamadım ama üstte p1.setName şeklinde setter yazarken,souta getter olarak yazıyoruz
    }
}
