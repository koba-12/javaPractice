package day17While_DoWhile;

public class DoWhileLoopIntro {

    public static void main(String[] args) {

        /*
        Aynı kümeyi tekrar tekrar yürütür
koşul doğru iken ifade
* İfade başlangıçta bir kez yürütülür
daha sonra döngü sonunda durum kontrol edilir
* Döngü gövdesindeki kod en azından yürütülür
bir zamanlar

syntax =  do{
            //loop body
            statement (s);
          }while(boolean ifadesi)
         */
        boolean a = false;

        for (int i = 0;a;){
            System.out.println("Wooden Spoon");//boş çıkar çünkü a = false
        }
        System.out.println("----------------------------------------------------");

        while (a){
            System.out.println(a);//false olduğu için boş çıkar do while ile karşılaştıracağız altta
        }

        System.out.println("-----------------------------------------");

        do {
            System.out.println("Wooden Spoon");
        }while (a);//1 tane wooden spoon çıkar

        /*
        karşılaştırma


        while loop:if statements ı tekrarlar
        while (condition){
            statement;
        }


        do while : just do it- sadece yapar
        do{
            statement;
        }while(condition);     //sanırım koşula aldırış etmiyor türkçe videodan daha detaylı öğrenip ekleyeceğim
         */
    }
}
