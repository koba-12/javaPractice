package day41_Exceptions;

public class TryCatchBlocks_2 {

    public static void main(String[] args) {

        System.out.println("test1 started");

        try {
            System.out.println(9/0);//normalde burası ArithmeticException hatası verir.ancak try&catch yaparak hata vermeden
            //catch blocka geçmesini sağlıyoruz.yani bu ve alttaki soutu pas geçiyor bu sayede ve catch blocka geçiyor
            System.out.println("try block");

        }catch (ArithmeticException e){//hangi hatayı alıyorsak buraya o hata yazılır ve sonra da"e" koyulur.

            System.out.println("catch block");
            System.out.println("arithmetic exception was occured");
        }
        System.out.println("test1 completed");
/*
handle ettik(üstesinden geldik).printler sırasıyla aşğıdaki gibidir
test1 started
catch block
arithmetic exception was occured
test1 completed
 */

        System.out.println("-----------------------------");

        System.out.println("test2 started");

        int[]numbers={1,2,3,4,5};

        try {
            System.out.println(numbers[200]);
            System.out.println("try block");
        }catch (RuntimeException e){//burada oluşacak tüm hatalar runTime exception başlığı altındadır.o yüzden direkt
            //bu şekilde yazmak en garantisi ve kolayıdır.
            System.out.println("catch block");
            System.out.println("runtime exception was occured");
//tamm olarak anlamadığım şey,catch blockta düzeltme yapıp yapamayacağımız.sanırım düzeltme yapmıyoruz,sadece yazdıklarımız
//gibi yapabiliyoruz.o halde try&catch block çok da önemli değil mi diye düşünüyor insan
//şöyle bir durum da varexceptions bu şekilde handle edilmiş oluyor ve edilebiliyor.ancak "error" handle edilemez!!!
        }
        System.out.println("test2 completed");
/*
test2 started
catch block
runtime exception was occured
test2 completed
 */


        System.out.println("---------------------------------------------");

        System.out.println("test3 started");

        try {
            System.out.println("cydeo".substring(2,0));//2 ile 0 arası seçilmez runtime err olur.0 ile 2 arası seçilir
            //yani geriye doğru olmaz.
        }catch (RuntimeException e){
            e.printStackTrace();//bu sayede sayfadaki tüm printler yine çıkar outa ama en son altta hata raporu da çıkar.
            //hangi satırda ne hatası yapılmış vs gibi.
        }
        System.out.println("test3 completed");

        System.out.println("--------------------------");

        System.out.println("test4 started");
        try {
            Thread.sleep(3000);//sleepin altında kırmızı çizgi çıkar.kırmızı uyarıdan try&catchi oto yapabiliriz.
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("test4 completed");
        }
    }


}
