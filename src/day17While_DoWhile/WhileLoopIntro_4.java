package day17While_DoWhile;

public class WhileLoopIntro_4 {

    public static void main(String[] args) {

        /*
        ıf koşulunu tekrarlar
        koşul döngü başlangıcında kontrol edilir
        koşul false olduğunda döngü sonlandırılır
        syntax= while (number <= 5){//number yazan boolean değerini test eder//döngünün gövdesini yürüttükten sonra baştan başlar
                sout.("Hello);//eğer boolean değeri(number yazan yer) true ise burası loop yapar
                number++;
                }

        hangi döngüyü kullanmalıyım?
        Hangisi uygunsa, bir for döngüsü, bir while döngüsü veya bir do-while döngüsü kullanabilirsiniz.
** Tekrar sayısı önceden biliniyorsa bir for döngüsü kullanılabilir
* Tekrar sayısı sabit değilse while döngüsü kullanılabilir
** Döngü gövdesi olması gerekiyorsa, while döngüsünü değiştirmek için bir do-while döngüsü kullanılabilir
koşul denetlenmeden önce yürütülür.
         */

        if (true){
            System.out.println("Wooden Spoon");//yalnızca 1 kere out olur
        }

        while (true){
            System.out.println("Wooden Spoon");//sonsuz kere out olur,tekrarlar
        }
    }
}
