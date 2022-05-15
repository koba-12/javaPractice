package day06_PrimitiveTypeCasting;

public class gg {

    public static void main(String[] args) {

        long a =3_000L;
        double b = (float)a;
        int c = (short)b;

        System.out.println(c % 1000);
    }
}
