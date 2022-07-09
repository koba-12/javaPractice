package day21_ArraysUtilityAndForEachLoop;

public class Initials_9 {

    public static void main(String[] args) {

        String []names={"elminur ablimit","ali kilic","hulya keles","sinem kaya","begench begenjov","ruveyda durna",
        "jonathan holly", "alshaun rodgers", "manas kalenov","gulsen sohret"};//unutmayalım her bir element ayrı ayrı işlem görüyor

        for (String each : names) {
            String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);//0 index nodan loopu başlattık her"space"
//sonrasındaki harfi aldık.her elementin 0. index nosu olarak sayılıyor
            System.out.println(initial);//sadece baş harfler out--e.a,a.k gibi ama alt alta sıralanır
        }
    }
}
