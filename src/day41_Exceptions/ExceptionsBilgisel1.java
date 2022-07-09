package day41_Exceptions;

public class ExceptionsBilgisel1 {

    /*
       Exceptions Topic:
1. Unchecked vs Checked
2. try & catch blocks
3. Multi-catch block
4. finally block
5. throws keyword
6. throw keyword
7. Custom exception


OutOfMemoryError: heap memory is full



            Exceptions: unexpected or unwanted events(beklenmedik ve istenmeyen olaylar)

Unchecked (unexpected event):runtime sırasında oluşur.tüm Runtime Exceptions are unchecked exceptions.

checked:compile time sırasında oluşur.runtime olmayan tüm exceptionlar checked exceptiondır.



Exception handlings:

1. Try & Catch blocks: used for handling checked and unchecked exceptions
try{
exception code
}catch(ExceptionClass  e){
e.printStackTrace();
there is an exception here tarzı bir şeyler yazarsa o compile atlanır.
catchin içinde exception olursa,execetion çalışmaz.
try içinde exeption yoksa,catchi pass geçer.

2.multi catch blocks:parent exception type, child exception typetan önce yerleştirilemez.
yani diyorki runtime exception diğer alt başlık exceptionlardan önce yerleştirilemez,en altta olmalı.

3.Finally Block:Son catch bloğundan sonra verilebilecek isteğe bağlı bir blok
Bir exception oluşup oluşmadığına bakılmaksızın her zaman try & catch bloklarından sonra yürütülür.
finally bloğunun yürütülmesini durdurmak için exceptionun işlenip işlenmediğine bakılmaksızın her zaman yürütülür:System.exit(0)
executed=yürütme

!!!Interview Question:!!!ÖNEMLİ
final(KEYWORD) vs finally(BLOCK) vs finalize(METHOD-GARBAGE COLLECTİONLA ALAKALI)!!!






İstenmeyen veya beklenmeyen bir olay
Derleme zamanı veya çalışma zamanı sırasında oluşur
iki exception kategorisi vardır.checked exception and unchecked exception
exceptions programımızın çökmesini önlemek için, bunları algılayan ve işleyen bir kod yazmalıyız


//slayta mutlaka tekrar bakalım şablon vs var
        Unchecked exceptions
compile timeda check edilmeyen exceptions
runtime esnasında oluşur
Kod, bunları işlemesek bile derlenir
They have IS A relationship with RuntimeException (parent class)



            checked exceptions
compile timeda check edilen exceptions
compile timeda oluşur
bunları işlemesek bile kod derlenmez
They do not have IS A relationship with RuntimeException class


başta da dediğim gibi pdf i mutlaka inceleyelim.orada bir tablo var başlarda kafamda bazı şeylerin oturmasına yardımcı olur.
en başta throwable var.throwable, exception ve error olarak ikiye ayrılıyor.biz ise konuya exceptionsın alt elemanlarıyla
başladık.sebebi nedir bilmiyorum.errorun alt elemanı yok çünkü sanırım ondan.şimdi errordan devam edeceğiz.



                Error
Yasadışı bir işlemin gerçekleştirildiğini gösterir
yalnızca runtime esnasında gerçekleşir
Kurtarılamazlar ve onlarla başa çıkmaları önerilmez


            Exception handling-try&catch block
bir exceptionın üstesinden gelmek için(handle)(checked or unchecked) try&catch bloklarını kullanabiliriz.
try{
    //try block statements
    //istisna atabilecek bazı kodlar
}catch(exception class e){
    //catch block statements
    //handle exception(if try block can't)



            Exception Object
runtime exception gerçekleştiğinde,java onu yakalar ve catch blocktaki bir variable a atar.
Başarılı bir şekilde yakalandıktan sonra variable'ı kullanabilir ve exception objectte bazı methodları çağırabilirizç

Popular methods of exception objects are:
    printStackTrace(): exceptionın yığın izni(stackTrace)(full details) print eder.
(bunda da mesela normalde hatadan sonrakiprintler çıkmıyor ya.böyle yaparssak çıkar,en altta da hata kodları çıkar.
full details olduğu için bu daha çok tercih edilir./e.printStackTrace()şeklinde yazılır.

    getMessage():exceptionın yalnızca brief description(kısa açıklamasını)döndürür(return)
(yani hatayı outa verir."Index 200 out of bounds for length 5" gibi.bu hata kodu normal şekilde print olur.
e.getMessage() şeklinde yazılır.
     */
}
