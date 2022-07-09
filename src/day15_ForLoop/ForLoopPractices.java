package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        // 15 16 17 ........ 45
        /*
        sout(15)
        sout(16)
        ...
        sout(45)
         */

        for(int i = 15; i<=45; i++){//sanırım i=15 olduğu için sadece 15-45 arası out oldu.15 den küçük sayılar olmadı
            System.out.print(i+ " ");//burada "println" değil "print" yazdık ve tüm sayılar yanyana çıktı.boşluk sayılar dipdibe olmasın diye
            //\n yaparak alt alta yazılabilir ama gerek yok,println yaparız
        }
        System.out.println();//bu boşluğu koyduk ve bu sayede hello alt satıra geçti.yani bu sayede new line a geçtik
        System.out.println("Hello");

        System.out.println("-----------------------------------------");

        //100 99 98 .... 50

        for (int i = 100; i >= 50; i--){//bu sefer tam tersi yani büyük eşit olduğu için "--" işareti koyduk (>=,<=,>,<)
            System.out.print(i + " ");//100 den 50 ye kadar loopladı
        }

        System.out.println();
        System.out.println("---------------------------------------------");

        //print all the even numbers between 1-55

        for (int i = 1; i<=55; i++){//bizden 1-55 arası çift sayılar isteniyor.normal loopumuzu yazarız.ekstra koşul içinse
            if (i % 2 == 0){//if condition yaratırız.yani for loop condition artı if condition yapmış oluruz
                System.out.print(i + " ");//sonra da sonuç çıkar(curly bracelere dikkat edelim)
                //ve mümkünse println değil print yapalım
            }
        }

        System.out.println();
        System.out.println("------------------------------------------------");

        //print all the even numbers between 1-55

        for (int i = 2; i<=54; i += 2){//bu da üsttekinin başka ve kısa yolu
            System.out.print(i + " ");
        }

    }
}
