package day20_arrays;

import java.util.Arrays;

public class ArraysIntro_1 {

    public static void main(String[] args) {

        /*
        notlara ve slayta mutlaka bak

        Birden çok element içerebilen özel variable
        Size is fixed
   supports primitives & non-primitives
   last index numbers always less then length!!!

   declaring array(bildirme):
   DataType[] variablename;

   Dizi başlatılıyor:
   eğerKesin verileri bilmiyorsak:
   1. DataType[] variablename= new DataType[length]

   Eğer kesin verileri biliyorsak:
   2. DataType[] variablename = {data1, data2, dat3 ...}
   int[]my List={1,2,3,4,5};

   arrays utility:
utility class arrayin yardımcı programıdır.arrayler için kullanılabilecek metodları sağlar.
class name: Arrays
package: java.util
toString(array): converts array to string

        Array:
1. Single Diemnsional
2. Arrays Utility
3. For Each Loop
4. Multi-dimensional array

* Özel Değişken türü
• Aynı veri türünde birden çok değer tutun
* Boyut sabittir
• Hem ilkelleri hem de ilkel olmayanları destekler
• Her Öğenin dizin numaraları vardır

Data Structure: to use the data efficiently, store data in organized //Veri Yapısı: verileri verimli kullanmak, verileri düzenli bir şekilde saklamak
manner
1. Array (size is fixed, supports primitives & non-
primitives)
2. Collection (size is not fixed, ONLY supports non-
primitives)
3. Map (size is not fixed, ONLY supports non-primitives)


There are 2 ways to declare one-dimensional arrays:

1. Türü belirtin ve sonra kareyi belirtin
parantezler [ ] ve son olarak dizi değişken adı.

int[] scores;
String[] names;
Student[] students;

2. Türü belirtin ve sonra diziyi belirtin
kare ile takip edilen değişken adı
parantezler [ ].

int scores[];
String names[];
Student students[];


arrayslerin örneklenmesi

Tek boyutlu bir arrayin örneğini oluşturmak için new anahtar sözcüğünü, ardından type ve ardından
son olarak köşeli parantez içindeki boyutu belirtin [ ]

1. Ayrı olarak bildir ve statementsarı örneklendir
int[]scores;
scores=new int[4];

2.tek olarak bildir ve statemensları örneklendir
int[]scores = new int[4];
String[]names = new String[5];


default values:
non-primiitives: null
primitives:
byte, short, int, long ===> 0
float, double ===> 0.0
boolean ==> false


array elements Erişme
* Bir array elements köşeli parantezler [ ] kullanılarak erişilebilir.
* indeks numarası sağlanmalıdır


array Başlatma
* Normal değişkenler gibi, Java da array oluştururken bir arrayin elementlerini başlatmanıza izin verir
int[]myList = {1,2,3,4,5};
         */

        //5 ad içerecek kadar yetenekli bir değişken oluşturun

        String[]myGroup = new String[5];//0-4 syntax ımız bu.[]içindeki 5 sayısı girdi yapabileceğimiz sayıyı belirtiyor.
        //index no aynı zamanda 5ten 1 küçük kadar girdi yapabiliriz.-yani aşağıdaki kelimelerin(isimler)herbiri bir elementtir.hepsi de uniquedir.5elemet var ama index noları 4 e kadar
        myGroup[0]="gunay";//bu ve alttaki0,1,2,3,4 index no demek.yani her kelimenin bir index nosu var(her parantez içi)
        myGroup[1]="neira";
        myGroup[2]="suat";
        myGroup[3]="mikael";
        myGroup[4]="hulya";
        //myGroup[4]="muhtar"; bu geçersiz çünkü index number yetmiyor yani burada en fazla 5 girdi olabilir(out of bounds)
        //5ten az girdi olursa isim yazmayan yerlerde null yazar.(her variable a göre değişiyor üstte hangisinde ne olur yazdım)
        //System.out.println(myGroup);bu hashcode oluyor burada bunu kullanmıyoruz.
        System.out.println(Arrays.toString(myGroup));//burada bu şekilde yazıyoruz-[gunay, neira, suat, mikael, hulya]
        //üstte yazdığım gibi out olur ama varsayalım myGroup[4] ="hulya"; yazmadım. bu sefer out
        //[gunay, neira, suat, mikael, null] olur

        System.out.println("----------------------------------------");

        String []days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};//sanırım bu üsttekinin kısayolu ve bunu kullanacağız
        //index              0         1          2             3          4          5          6

        System.out.println(Arrays.toString(days));//[monday, tuesday, wednesday, thursday, friday, saturday, sunday]

        int number=5;

        if (number<1 || number>7){
            System.err.println("invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);//number=5 yani saturday -1 de friday out verir.



    }
}
