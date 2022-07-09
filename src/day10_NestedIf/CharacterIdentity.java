package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = '@';// ch de tek kesme işareti yapılır--buraya eğer örneğin 65 yazsaydım cevap alphabetic çıkardı
        // çünkü 65 sayısı tabloda bir harfe denk gelir.O yüzden dolayı sayı yazarken '65' şeklinde yazmalıyız.

        if (ch >='0' && ch <= '9'){
            System.out.println("Digit");//@ işareti 0 ve 9 arası değil
        }else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
            System.out.println("Alphabetic");//@ işareti a veya z arası da değil. NOT: BÜYÜK HARF KÜÇÜK HARF YAPILMALI
        }else {
            System.out.println("Special character");//cevap bu
        }
    }
}
