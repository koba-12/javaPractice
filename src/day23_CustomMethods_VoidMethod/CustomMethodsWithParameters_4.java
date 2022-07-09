package day23_CustomMethods_VoidMethod;

public class CustomMethodsWithParameters_4 {

    /*

    Custom Methods:
1. void methods
2. void methods with argumnets
3. return methods
4. returns with argumnet
5. overloading


    Passing Argument to Method(Bağımsız Değişkeni Yönteme Geçirme)

    * Bir yöntem bildirdiğimizde parametreler verilebilir
* Yönteme iletilen parametreler değişkenler gibi davranır
Ek bilgi yöntemi sağlamak için kullanılan •bu taski gerçekleştirmek için gerekli
AŞAĞIDA PARAMETERİ YAZDIM BAK


Calling Method That Need Information(Bilgiye İhtiyaç Duyan Arama Yöntemi)

* methodun kullanması gereken değerleri belirtmelidir
* Değerler, method adını izleyen parantez içinde verilmelidir
* methoda aktardığımız değerlere argüman denir
* arguments değer veya değişken olarak sağlanabilir.
displayValue(5)---5:argumentstir
AŞAĞIDA ARGUMENTS ÖRNEĞİ VAR
     */


    public static void main(String[] args) {

        oddOrEven(10);//method, görevini tamamlamak için ek bilgi ister-aşağıdakinin değerini buraya yazdık.DEĞER ARGUMENTTİR

        System.out.println("------------------------------------");

        ageOfPerson(1995);//BUNUN İÇİNDEKİ 1995 ARGUMENTTİR!!!

        printNumbers(10,20);//bak buraya kendim 10 ve 20 değeri atadım.aşağıda parameteri x ve y olarak atadığım için
        //buradaki x ve y oto çıktı.

    }
    //create a function that can check if a numbet-r is odd number or even number
    public static void oddOrEven(int number){//BUNUN İÇİNDEKİ İNT NUMBER PARAMETERDİR
        if (number%2==0){
            System.out.println(number+"is even number");
        }else {
            System.out.println(number+"is odd number");
        }
    }

    public static void ageOfPerson(int birthYear){//BUNUN İÇİNDEKİ İNT NUMBER PARAMETERDİR
        int age=2021-birthYear;
        System.out.println("your age is"+age);
    }

    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){
        System.out.println();
    }
}
