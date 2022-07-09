package day37_OOPInheritance.phoneTask;

public class Iphone_2 extends Phone_1{


    public Iphone_2(String model, String size, double price, String color) {//bu sütundan brandi sildim
        super("Apple", model, size, price, color);//buradan da brandi silip onun yerine "apple" yazdım.
        //böylece bir instance e değer atamış oldum.bu taskde sadece brand istendği için diğerlerine dokunmadım
        //örneğin modele de 13 pro yazsaydım buradaki tüm ürünler 13 pro olmuş olacaktı.ancak değişken olmasını istediğim için yazmadım
        //static variables burada olamaz
    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" is having a facetime with"+phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(brand+" "+model+ " is having a facetime with"+email);
    }
}
