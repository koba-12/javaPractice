package day21_ArraysUtilityAndForEachLoop;

public class ForEachLoop_2 {

    public static void main(String[] args) {

        //for each loop :her bir loop için demek
        /*

        NOT:DATA STRUCTURE'S =ARRAY,COLLECTİON,MAP
*Bir veri yapısının birbirini izleyen her değerine erişmek için kullanılır
* Bir veri yapısı olmalıdır(data structure) (array veya
collection veya map) her döngü için kullanılacak
* iteration süreleri ve orderlar sabittir
* index numaraları yoktur,elementler vardır
*
* elements in the data structure=true ise---- stataments olur////false ise durur
* Veri türü(data type), veri yapısının(data structure) ardışık değerleriyle eşleşmelidir
For Each Loop: a loop that's already iterated.
iteration starts from index 0
 pre-condition: there MUST be a data
structure
 for(DataType each : Array ){
 }

syntax=  for(dataType variableName : dataStructure){
                }    //statement
yani şöyle düşünelim: int[]numbers={3,6,9};
                      for(int each : numbers){ --------int=data type------each=variable name---------numbers=data structure
                          sout(each);
                       }sanırım bu for each loopu arraylerde kullanıyoruz
         */

        int[] numbers={10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) {//İ:İNDEXES OF ARRAY!!!
            int eachElement=numbers[i];
            System.out.println(eachElement);//bu normal loopumuz alta for eachi yapacağız
        }

        System.out.println("----------------------------------------");

        for (int each : numbers){//EACH: ELEMENTS OF THE ARRAY!!!BURAYA DİKKAT BAK ÜSTTEKİ FOR LOOPTA ARRAYIN İNDEXİ,BURADA İSE ELEMENTİ
            //YANİ BUNDAN ŞUNU ÇIKARABİLİRİZ Kİ "İ" İLE "EACH" BURADA AYNI GÖREVLERDE!!!
            System.out.println(each);//bu da üsttekinin aynısı sonucu verir(yukarıdan aşağı 10-70 arası)
        }
    }
}
