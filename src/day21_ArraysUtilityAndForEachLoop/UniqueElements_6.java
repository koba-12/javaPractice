package day21_ArraysUtilityAndForEachLoop;

public class UniqueElements_6 {

    public static void main(String[] args) {

        String[]words={"layan","layan","oleksandr","olga","adam","adam","adam","cihad","cihad","cydeo"};

        for (String each : words) {//each:wordsün her elementi
            //{"layan","layan","oleksandr","olga","adam","adam","adam","cihad","cihad","cydeo"};önce bunları loopluyor
//layan ı aldık mesela bu layana aşağıdaki looptan bakıyor.kaç tane var diye.if conditiondan dolayı 2 kere tekrarlananı
// outa almıyor ve geçiyor çünküif(count==1)yaptık.sonra diğer layana geçiyor ve ona da aynısını yapıyor.o da 1 tane olmadığı için
//outa almıyor ve oleksandr a geçiyor.ona da aynı işlem uygulanıyor ve o 1 tane olduğu için onu outa alıyor ve bu şekilde
// sonuna kadar devam ediyor.outa if conditiondan dolayı sadece oleksandr,olga ve cydeo alınıyor
            int count=0;
            for (String elements : words) {
                if (elements.equals(each)){//elementi üstteki looptaki eache eşitledik-element de wordsün her elementi
                    count++;//artıya doğru looplar
                }
            }
            if (count==1){//countu 1 olanları alır
                System.out.println(each);//oleksandr,olga,cydeo
            }
        }
    }
}
