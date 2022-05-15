package day05_Concatenation;

public class ShippingAdress {

    public static void main(String[] args) {

        String name = "Cüneyt Yılmaz",      // her seferinde string yazmadan virgülle devam edebiliriz.Son koda noktalı virgül koyarız.
                buildingNumber = "123456C",
                streetName = "Atatürk",
                city =  "Mclean",
                state = "VA",
                zipCode = "22031A";

        //System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);
        // boşluk için sadece çift tırnak da açabiliriz.
        // "\n" işareti satır atlamak için kullanılır.

        //2. yöntem (kenarda dursun 1. yöntemi kullanırım.)
        String adress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(adress);


    }
}
