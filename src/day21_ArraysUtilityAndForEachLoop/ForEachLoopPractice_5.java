package day21_ArraysUtilityAndForEachLoop;

public class ForEachLoopPractice_5 {

    public static void main(String[] args) {

        String []words={"java programming","cydeo school","wooden spoon","early birds","angry birds"};

        for (String each : words) {
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));//bu bize her kelimenin ilk ve son harflerini verdi
// nasıl olduğunu tam anlamadım üstüne biraz daha düşüneceğim.ama şunu söyleyeyim "" işaretini koymazsak bize o harflerin
// ascii tabledaki sayı karşılığını verir."" koyunca harfleri verdi bu önemli!!!!!
        }
    }
}
