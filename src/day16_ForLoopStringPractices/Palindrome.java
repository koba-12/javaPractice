package day16_ForLoopStringPractices;

public class Palindrome {

    public static void main(String[] args) {
         //düz ve ters yazılışı aynı kelime,cümle,sayılar

        String word = "Level";
        String reversed = "";

        for (int i = word.length()-1; i >= 0; i--){
            reversed += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(reversed);//burada "Level" içindeki büyük küçük harf farkını
        //görmezden gelmek için ignorecase yaptık.boolean da palindrome mu değil mi için.true or false
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
