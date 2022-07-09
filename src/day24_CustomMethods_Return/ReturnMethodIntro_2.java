package day24_CustomMethods_Return;

public class ReturnMethodIntro_2 {

    public static void main(String[] args) {

        String str="java";
        String result=reverse(str);//normalde void methodu olsa burayı böyle yazamazdık.-yani demem o ki
        //return methodda buraya değişken değer yazmamız lazım
        System.out.println(result);

        if (str.equalsIgnoreCase(result)){
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+" is not palindrome");//outa java is not palindrome çıkar
        }

    }

    public static String reverse(String str){//buraya void değil variable yazıyoruz returnde

        String reverse ="";

        for (int i = str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return reverse;//bunun sayesinde outu almış olduk.yani önce burası yani return method işlem gördü outa avaJ çıktı.
//sonrasında main methoddakiler işlem gördü ve java kelimesinin palindrome olmadığını öğrendik.bunu sayesinde diyoruz ama
//tabiki üste sout(result) yazmalıyız

    }


}
/*
return method: return type is not void MUST return a value
return statement:methodtan çıkmak için kullanılır return methodlarından bir değer döndürmek için kullanabiliriz
method, bir return  statement kullanarak bir değer döndürebilir.
return type void olamaz,bir veri türü(data type) olması gerekir.

syntax:
//            (return type)----(int sum,return typetır.buraya void gelemez bu tarz değerler gelmelidir)
public static int sum   (int num1,int num2){

     int result;
     result=num1+num2;

     return result;
   //return expression
}
yine bunun için de slayta mutlaka bak özellikle son sayfaya(zaten 2 sayfa return method)
 */
