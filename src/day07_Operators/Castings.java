package day07_Operators;

public class Castings {

    public static void main(String[] args) {

        float averageScore = 20.5f; // sanırım dönüştürmek için f koyuyoruz

        byte num1 = (byte)averageScore;// explicit casting = smaller to larger   --- casting dönüşüm gibi bir şey
        short num2 = (short)averageScore;// explicit casting
        int num3 = (int)averageScore;// explicit casting
        long num4 = (long)averageScore;// explicit casting
        float num5 = averageScore;// no casting - ikisi de aynı
        double num6 = averageScore;// implicit casting = the larger to smaller

        System.out.println("num1 = " + num1);//integer(tam sayı) olduğu için 20 çıkar
        System.out.println("num2 = " + num2);//integer(tam sayı) olduğu için 20 çıkar
        System.out.println("num3 = " + num3);//integer(tam sayı) olduğu için 20 çıkar
        System.out.println("num4 = " + num4);//integer(tam sayı) olduğu için 20 çıkar
        System.out.println("num5 = " + num5);//kendi olduğundan 20.5
        System.out.println("num6 = " + num6);//floating point(ondalık sayı) olduğundan 20.5

    }
}
