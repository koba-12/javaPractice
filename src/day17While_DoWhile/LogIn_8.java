package day17While_DoWhile;

import java.util.Scanner;

public class LogIn_8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your username");
        String u = scan.next();

        System.out.println("enter your password");
        String p = scan.next();

        if (u.equals("Cydeo") && u.equals("Cydeo123")){//eğer bilgiler doğruysa
            System.out.println("logged in");//bu out olur
        }else {//bilgiler doğru değilse aşağıdakiler out olur
            int attempts = 3;//deneme hakkı-geriye doğru saydırdık aşağıda
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts>0){//kimlik bilgileri geçersizken ve kullanıcı yeniden girme girişiminde bulunurken.
                if (attempts == 1){
                    System.out.println("THIS IS YOUR LAST CHANCE");//MESELA BURAYI SONRADAN EKLEDİK.BU TASKİ ÇOK İYİ ANLADIM
                }//BAZI ŞEYLERE AÇIKLIK GETİRMEK İÇİN YENİDEN İZLENEBİLİR.BAZI ŞEYLERDEN KASTIM BAŞKA KONULARI DA ANLAMAMA VE DAHA BÜYÜK ÇERÇEVEYİ GÖRMEMİ SAĞLAYABİLİR
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("enter your username");
                u = scan.next();

                System.out.println("enter your password");
                p = scan.next();
                attempts--;//BU TASKİ İYİ İNCELE.BAK BURADA BUNU YAZDIK ÇÜNKÜ ATTEMPTS(DENEME HAKKININ) HATA VERDİKÇE
                //AZALMASINI İSTİYORUM.WHİLE İÇİNDEKİ KODLA BAĞLANTILI İTİ BAK.BU DURUMU İYİCE ANLAYARAK
                //DİĞER LOOPLARDA DA NEDEN SÜREKLİ SONDA .....++ ŞEKLİNDE YAZDIĞIMIZI ANLAYABİLİRİM.(bu bölüm syntaxında var DİKKAT!)
            }
        }
        if (u.equals("Cydeo") && p.equals("Cydeo123")){//buraları da 3 döngü bittikten sonra bu cevabı vermesi için yazdık
            System.out.println("Logged in");
        }else {
            System.out.println("Your account is locked");
        }
        scan.close();
    }
}
