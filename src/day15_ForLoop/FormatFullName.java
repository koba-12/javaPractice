package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {

        /*
        3. Write a program that asks user to enter first and last names, and
then prints the full name in regular format (first character in upper
case)
input:
firstName = "cyDEo"
lastName = "SCHOOL";
output:
Cydeo School
         */

        String firstName = "cyDEo",
                lastName = "SCHOOL";

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();//(0,1)c yi seçti+ dan sonra da bitiş harfi koymadığımıaz için kelime sonuna kadar lower case oldu
//                  C                  +                    ydeo
        //charat kullanmadık çünkü o int olduğu için upper-lower case kullanamaz.
        //firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase(); başka bir yol

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        //ben burada kendim denemek için önce sadece lastName.substring(1).toLowerCase() yazdım ancak olmadı
        //çünkü tüm harflere işlem uygulamam gerekiyormuş.yani baştaki "S" harfi zaten büyük harf olmasına rağmen yine ona da büyük harf yapma işlemi uyguladık

        System.out.println(firstName);
        System.out.println(lastName);

        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);

    }
}
