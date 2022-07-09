package day16_ForLoopStringPractices;

public class DigitsLettersSpecialCharacters {

    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";
        String digits = "";//12345
        String letters = "";//CydeoSchoolWoodenSpoon
        String specialChars = "";//!@#$%

        for (int i = 0; i < str.length(); i++) {//<= ve lenght()-1 yerine böyle de yazılabilir
            char ch = str.charAt(i);//BU İŞİN KURALI BUNU BU ŞEKİLDE YAZMAK!!!--str nin her karakterini burası içerir.0 ve last index arasını

            if (ch >= '0' && ch <= '9'){//karakter 0-9 arasıysa rakamdır
                digits += ch;
            }else if (ch >= 'A' && ch <= 'Z'){//A-Z arasıysa harftir
                letters += ch;
            }else if (ch >= 'a' && ch <= 'z'){//a-z arasıysa harftir
                letters += ch;
            }else {
                specialChars += ch;//rakam veya harf değilse cevap budur
            }//bu curly brace ile açma curly brace i arasına bir if condition daha koyabiliriz.
            // örn.if(ch!= '@') yaparak @ işaretini outa aldırtmayız

        }
        System.out.println("digits = " + digits);//12345 out
        System.out.println("letters = " + letters);//CydeoSchoolWoodenSpoon out
        System.out.println("specialChars = " + specialChars);// !@#$% out
    }
}
