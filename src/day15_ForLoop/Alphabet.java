package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {

        //A-Z === 65-90      --- ascii table da bu harfler bu sayılara denk geliyor

        for (int i =65; i<=90; i++){//bu sayılarla kodumuzu yazdık
            System.out.print((char) i + " ");//sonra char koyarak(parantez içinde) o sayıları ascii tabledaki characterlere döndürdük.
            //her karakterin bir sayı değeri vardır(ascii tableda)
        }
        System.out.println();

        System.out.println("----------------------------------");

        for (char i = 'A'; i<='Z';i++){
            System.out.print(i+" ");//A......Z
        }
        System.out.println();

        System.out.println("---------------------------");


        for (char i = 'a'; i<='z';i++){
            System.out.print(i+" ");//a........z
        }

        System.out.println();
        System.out.println("-----------------------------");

        //Z-A

        for (char i = 'Z'; i>='A'; i--){//harf değeri olarak ve mantıken Z,A dan büyük olduğu için >= kullandık ve i-- yaptık
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        for (char i = 'z'; i>='a'; i--) {//harf değeri olarak ve mantıken Z,A dan büyük olduğu için >= kullandık ve i-- yaptık
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("--------------------------------");

        for (char i = 1 ; i<=4000; i++){
            //System.out.print(i+" ");//40000 tane farklı karakter out oldu//bilgisayarı yormasın diye kapadım
        }


        }
}
