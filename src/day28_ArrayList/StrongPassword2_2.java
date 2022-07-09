package day28_ArrayList;

public class StrongPassword2_2 {

    public static void main(String[] args) {

        String password="cYdeo1990@";

        int countUpperCase=0;
        int countLowerCase=0;
        int countSpecialChar=0;
        int countDigits=0;

        for (int i = 0; i < password.length(); i++) {
            char each=password.charAt(i);//passwordun loopunu eache eşitledik.

            if (Character.isUpperCase(each)){//eğer upperCase varsa countu artıya doğru loopla komutu verdik
                countUpperCase++;
            }else if (Character.isLowerCase(each)){
                countLowerCase++;
            }else if (Character.isDigit(each)){
                countDigits++;
            }else {
                countSpecialChar++;
            }
        }

        boolean hasUpperCase=countUpperCase>0;
        boolean hasLowerCase=countLowerCase>0;
        boolean hasDigit=countDigits>0;
        boolean hasSpecialChar=countSpecialChar>0;
        //bu strong passwordün 2.yöntemi olduğunu unutmayalım.bu yöntemde temel amaç istenilenin 0 dan büyük olması.yani en az 1 kere olması.

        //boolean strongPassword=password.length()>=8&&!password.contains(" ")&&hasUpperCase&&hasLowerCase&&hasDigit&&hasSpecialChar;
//bunun yerine aşağıdaki gibi nested if de kullanabiliriz.

        boolean strongPassword=false;

        if (password.length()>=8){
            if (!password.contains(" ")){
                if (hasUpperCase){
                    if (hasLowerCase){
                        if (hasDigit){
                            if (hasSpecialChar){
                                strongPassword=true;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("strongPassword = " + strongPassword);
    }
}
