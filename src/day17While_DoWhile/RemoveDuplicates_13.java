package day17While_DoWhile;

public class RemoveDuplicates_13 {

    public static void main(String[] args) {

        String str = "AABBCC";
        String result = "";//ABC

        for (int i = 0; i < str.length(); i++) {
            //char ch = str.charAt(0);
            String ch = "" + str.charAt(i);//bu ve üstteki aynı şey aynı anlam--A A B B C C

            if (result.contains(ch)){//sonuç(result) karakteri zaten içeriyorsa
                continue;//eğer break yazsaydım sadece A out olurdu.
            }
            result += ch;
        }
        System.out.println(result);//ABC
    }
}
