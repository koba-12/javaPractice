package day42_Exceptions;

public class ThrowsKeyword_3 {

    public static void main(String[] args) throws InterruptedException{//aynı try&catchin işlevini görüyor ama daha pratik.

        System.out.println("-------------test1-----------------");

        System.out.println("hello");
        Thread.sleep(3000);
        System.out.println("cydeo");

        System.out.println("---------test1 completed------------");

        System.out.println("---------test2----------");

        System.out.println("hello");
        Thread.sleep(3000);
        System.out.println("batch25");

        System.out.println("------test2 completed------------");
//throwsu main methodun yanına yazıyoruz(veya başka methodlar da olur) ve onun yanına da hata türü(exception türü)neyse onu yazıyoruz.
//throwsta try&catch le aynı işe yarıyor ama daha kolay ve hızlı.
//eğer birden fazla exception varsa,ilk exception typeın yanına virgül koyup ikinci exeption type neyse onu yazarız.
//try&catchde yaptığımız gibi kırmızı uyarıdan ilkini seçersek bunu shortcut olarak verir.
    }
}
