package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        //day14 notlarına bakılabilir

        String email = "cydeo.school@gmail.com";

        int beginningIndex = email.indexOf("@") + 1;//sadece gmail kısmını almak istiyorum.
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex , endingIndex);

        System.out.println(domain);


        System.out.println("-------------------");

        String str1 = "Java is fun, Java is cool, I love Java";

        String s1 = str1.substring(0, 10+1);//java is fun-harfe karşılık gelen sayı outa alınmıyor o yüzden +1((1 yazsak da oluyor)
        int beg = str1.indexOf(" J") + 1;// sanırım son kelimeye kadar out almak istemiyorsak +1 koyuyoruz
        int end = str1.lastIndexOf(",");
        String s2 = str1.substring(beg,end);//java is cool
        String s3 = str1.substring(str1.lastIndexOf("I"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
