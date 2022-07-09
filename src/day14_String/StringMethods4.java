package day14_String;

public class StringMethods4 {

    public static void main(String[] args) {

        //repeat() : adı üstünde "" içini tekrarlar
        String str = "Cydeo";
        String str2 = str.repeat(4);//CydepCydeoCydeoCydeo
        System.out.println(str2);

        String s1 = "Wooden Spoon";
        String s2 = s1.repeat(100);
        System.out.println(s2);//Wooden SpoonWooden Spoon -- sona boşluk koyarsak her kelime arası boşluk olur

        System.out.println("--------------------------------");

        System.out.println("Fady ".repeat(15));//kısayolu

        System.out.println("----------------------------------");

        String name = "Java";
        System.out.println((name + " ").repeat(5));//başka yöntem

    }
}
