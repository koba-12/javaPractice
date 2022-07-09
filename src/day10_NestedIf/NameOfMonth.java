package day10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {

        int number = 15;
        String result = "";//geçici buraya herhangi bir şey yazmak yeterli.kısaca "" koyup geçiyoruz

        if (number >= 1 && number <= 12){//if the number is valid

            if (number == 1){
                result = "january";
            }else if (number == 2){
                result = "february";
            }else if (number == 3){
                result = "march";
            }else if (number == 4){
                result = "april";
            }else if (number == 5){
                result = "may";
            }else if (number == 6){
                result = "june";
            }else if (number == 7){
                result = "july";
            }else if (number == 8){
                result = "august";
            }else if (number == 9){
                result = "september";
            }else if (number == 10){
                result = "october";
            }else if (number == 11){
                result = "november";
            }else if (number == 12){
                result = "december";
            }
        }else {
            result = "Invalid number";//if the number is valid
        }
        System.out.println(result);//gördüğümüz gibi çok zor bir şey değil sadece uzun olabiliyor bu yüzden dolayı
        // yaptığım işlemlere dikkat edeyim yeter.başa ön koşul gerisi multi branch gibi bir tek en sona
        // december yazmaya gerek yok else yapıp bitirebilirim.burada koysak da olur diye koydum
    }
}
