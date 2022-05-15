package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        //short b = (short)a;
        //       (short)a

        int c = b; // implicit casting
        // int c = (int)b

        long d = c;
        //     long(c)

        float e = d;
        double f = e;

        //System.out.println(-----------); //buralar türkçe videodan izlenecek pek anlamadım ama önemli olmayadabilir
        //ayrıca bunlar küçük birimli işareti büyüğe çevirme(float ı double'a gibi)

        int x = 55;
        short y = (short)x;  // explicit casting (bu da büyüğü küçüğe çevirme) ama manuel girmek gerek diyor
        // elle pek anlamadım.

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j + " : " + k); // burada dönüşmez çünkü "1000000" sayısı short un range ini aşıyor.

        double l = 2.5;
        float m = (float)l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int)n;  // 10 olarak çıkar çünkü int tam sayılar için

        System.out.println(n + " : " + s);

        double d1 = 20.5;
        short s1 = (short) d1; //sadece d1 yazdım yanlış olduğu için soldaki kırmızı alertten oto düzeltti
        // (alt enter kısayolu)
        System.out.println(d1 + " : " + s1);





    }
}
