package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        /*bir değişkenin değerini birden çok değerle karşılaştırmak ve eşlşmeye dayalı olarak bazı ifadeleri yürütmek
        için kullanılan switch case ifadesi
        switch ifadesi tek bir değere göre değerlendirilmelidir.
        long,double,float ve boolean KULLANILAMAZ.string de kullanılamaz çünkü stringde"" olmalı ama casedeki sayılarda olamaz
        baştaki ifadede de int,short,char ve byte kullanılır.switch,case,default,break kullanılr
        neden if yerine bu kullanılır?
        default ifadesi herhangi bir yerde kullanılabilir.son satır olma zorunluluğu yoktur.

        syntax(sözdizimi)
        switch(data){
             case data1:
                     statements;
                     break;
             case data2:
                     statements;
                     break;
             default:
                     statements;
                     break;

         */

        int number = 5;//buraya eğer case i olmayan bir sayı koysaydık (1-7 dışı) cevap boş çıkar.
        // bu yüzden dolayı sona default eklemeliyiz.defaultta"invalid" yazdığımız yer yani burada "else" görevi görüyor

        switch (number){//case değeri switch data types ile eşleşmeli ve unique olmalı yani case 1,2,3 diye gitmeli

            case 1:
                System.out.println("monday");//statements
                break;//exist the switch after executing the case block//case bloğundan sonra switch ifadesinden
        // çıkmak için kullanılır.yani her bölüm diyeyim(case,sout,break) switch in içinde.switchi sonlandırıp yeni
            //bir case e (olaya yani oradan bağlantı kur.dosyayı break ile kapatıyoruz) geçmek için kullanırız
            // eğer break ifadesi koymazsak switch ifadesi bidahaki break e veya { işaretine kadar devam eder
            // devam eder derken out olarak bidahaki break veya { işaretine kadar olan her şey çıkar
            case 2:
                System.out.println("tuesday");
                break;//exist the switch after executing the case block
            case 3:
                System.out.println("wednesday");
                break;//exist the switch after executing the case block
            case 4:
                System.out.println("thursday");
                break;//exist the switch after executing the case block
            case 5:
                System.out.println("friday");//eğer break koymazsak cevap:friday /n saturday olur
                break;//exist the switch after executing the case block
            case 6:
                System.out.println("saturday");
                break;//exist the switch after executing the case block
            case 7:
                System.out.println("sunday");
                //break;//exist the switch after executing the case block
            default:// sadece caselerin hiçbiri çalışmıyorsa yürütülür,else gibi
                System.out.println("invalid");//buraya break koymaya gerek ama koysak da aynı sonuç çıkar hata vermez

        }//bunların hepsi switch curly brace in içinde olmalı
    }
}
