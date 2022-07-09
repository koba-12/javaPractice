package day24_CustomMethods_Return;

public class BreakfastTask_1 {

    public static void main(String[] args) {

        initials("cydeo", "school");//buraya cydeo school yazmama rağmen outa aşağıdaki souttan dolayı hello world çıkar.
//o yüzden buraya yazdığımın çıkması için hello world yazan soutu kapatıp yeni kodlar yazacağım.
        System.out.println("------------------------------------------");

        domain("cydeo@gmail.com");

        System.out.println("-----------------------------------------");

        String[] emails = {"alex@gmail.com", "lugano@yahoo.com", "appiah@cydeo.com", "luciano@hotmail.com"};
        for (String email : emails) {
            domain(email);//burada da loop yazdık ve yukarıdaki e-mail adreslerinin tamamını döngüye sokup void bölümündeki
//seçimlerle sadece domainini out almış olduk
        }

        System.out.println("------------------------------------");

        nameOfMonths(12);//1-12 arası bit sayı yazmasam "month name=invalid" yazardı


    }

    //1. Create a method that can display the initials of the person
    public static void initials(String firstName, String lastName) {
        //System.out.println("hello world");
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);//evet yeni kodları yazdıktan sonra üstte argumentse yazdığımın baş harflerini out yaptık
    }


    // 2. Create a method that can display the domain of the email
    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));//burada substring methoduyla
//@ ile . arasını yani domain bölümünü seçtik.üstte fragmente yazacağımız e-mail adresi sonrası @ ve . arası domain olarak out olacak.
        System.out.println("domain = " + domain);
    }


    //  3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonths(int number) {

        String name = "";

        if (number >= 1 && number<=12){//argument1-12 arası ise aşağıdakilerden biri out
            name=(number==1)? "jan":(number==2)?"feb":(number==3)?"mar":(number==4)?"apr":(number==5)?"may":(number==6)?
                    "june":(number==7)?"july":(number==8)?"aug":(number==9)?"sep":(number==10)?"oct":(number==11)?"nov":"dec";
//üstteki yöntemi hatırlayalım tekrar edelim büyük kolaylık
        }else {//1-12 arası değilse invalid
            name="invalid";
        }
        System.out.println("month name = "+ name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method


}


/*
        method: grouping code fragments ===> creating a function
advantage: improves the re-usability of our codes

                                    MUST       MUSt
Access-Modifier   specifier   return-type  name (Parameter){
code fargments
}

Acess modifier: public
public: ALWAYS ACCESSIBLE

Specifier: static
static: method can be called through its class name

ReturnType: void, any dataType
void: does not return a value
any dataType: MUST return a value

Parameter: any dataType (if the method needs additional info)

Method Name: meaningful, descriptive

         */
/*
1. Create a method that can display the initials of the person
2. Create a method that can display the domain of the email
3. Create a method that can display the name of the month based on
the given number to the method
4. Create a method that can print the name of the day based on the
given number to the method
5. Create a method that can print how many days a month has
 */
