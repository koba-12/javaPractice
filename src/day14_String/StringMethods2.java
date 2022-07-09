package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        //replace(oldValue,newValue)//ikiye ayrılıyor  //replace yer değiştirme demek
        //string kullanılıyor
        //old value yu new value ile değiştirir.

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java" , "Python");
        //burada cevap "Python is fun, I love learning Python" olur.
        // yani bu şekilde yazınca parantez içini java yerine python geliyor

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


        String email = "cüneytyilmaz@yahoo.com";
        email = email.replace("yahoo" , "gmail");

        System.out.println("email = " + email);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python ";
        String sentence2 = sentence.replace("Python " , "");//tüm pythonlatı ve pythondan sonraki spaceleri kaldırır
        //bu şekilde bir kelime kaldıracağımız zaman space bırakmayı unutmayalım kelime sonuna

        System.out.println("sentence2 = " + sentence2);


        String s = "dog dog dog dog dog";
        s = s.replace("dog" , "cat");
        System.out.println("s = " + s);

        String s2 = "C# is cool, C# is fun";
        s2 = s2.replace(" C#" , " Java");//"C# is cool, Java is fun" çıkar //çünkü ilk C# nin başında space yok
        System.out.println("s2 = " + s2);


        String s3 = "Java";
        s3 = s3.replace("a", "e");
        System.out.println("s3 = " + s3);//Jeve


        System.out.println("-------------------------------------");

        //replaceFirst: sadece hedef ilk kelimeyi değiştirir veya harfi

        String result = "Java Java Java";
        result = result.replaceFirst("Java" , "Python");
        System.out.println("result = " + result);


        String result2 = "C# is cool, C# is fun";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);


        String result3 = "Java";
        result3 = result3.replaceFirst("a", "e");
        System.out.println("result3 = " + result3);



    }
}
