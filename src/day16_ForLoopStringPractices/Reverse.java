package day16_ForLoopStringPractices;

public class Reverse {

    public static void main(String[] args) {

        String str = "Wooden Spoon";//bu taskde bizden Wooden Spoon un tersini yazmamız isteniyor.
        //index       01234567891011
        String result = "";// str nin reverse versionını içerir.bu da wooden spoon un tersini ima ettiğinden!!!!!
        //aşağıdaki işlemi yaptık tek tek

       /* result += str.charAt(11);//+= demek x=x+y demekti UNUTMA!--n
        result += str.charAt(10);//o
        result += str.charAt(9);//o
        result += str.charAt(8);//p
        result += str.charAt(7);//S
        result += str.charAt(6);//"space"
        result += str.charAt(5);//n
        result += str.charAt(4);//e
        result += str.charAt(3);//d
        result += str.charAt(2);//o
        result += str.charAt(1);//o
        result += str.charAt(0);//W

        */

        //loopla yapıcaz şimdi

        for (int i = str.length()-1; i >= 0;i--){//i= str nin index number ı.bu yaptığımızda da
            //lenghth() dolayısıyla "wooden spoon" un son harfini seçmiş olduk.yani 11 index number.11 index numberdan
            // 0 index number a kadar looplayacak
            result += str.charAt(i);//yani sonuç eşittir str(Wooden Spoon)nin charAt(toplam index nosu i nin(döngüsü)))
            //+= sebebi sonuca her bir karakteri eklemek için
        }
        System.out.println(result);

    }
}
