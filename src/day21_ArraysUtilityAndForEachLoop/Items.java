package day21_ArraysUtilityAndForEachLoop;

public class Items {

    public static void main(String[] args) {

        //BU ÖNEMLİ ÇALIŞIRKEN İŞE YARAYABİLİR!!!

        String [] items={"shoes","jacket","gloves","airpods","ipad","iphone 12 case"};
        //                  0        1        2         3       4            5
        double[]prices={99.99,   150.0,   3.99,   250.0,   439.50,  39.99};
        //                0        1         2      3        4         5
        int[]itemIDs={12345,12346,12347,12348,12349,12350};
        //              0     1      2     3     4     5

        for (int i = 0; i < items.length; i++) {//items.fori yaptık--for each loopu 1 arrayde kullanıyoruz.burada 3 array olduğu için for loop kullandık
            String item = items[i];//tek bir loop içinde bunları yazarak basit bir şekilde eşleştirip loopladık
            double price=prices[i];//her loopta bu üçünün değerlerini yanyana outa veriyor ve eşleşiyor.
            int ID=itemIDs[i];//loop bitince yeni satıra geçiyor ve onlar da eşleşiyor

            System.out.println(item+"-"+price+"-"+ID);//hepsi eşleşip outlanıyor
        }


    }
}
