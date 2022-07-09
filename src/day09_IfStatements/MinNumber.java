package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        boolean n1İsMin = n1<n2;
        boolean n2İsMin = n2<n1;
        boolean equal = n1 == n2;

        if (n1İsMin){
            System.out.println(n1 + " is the minimum number ");//if n1 is the minimum number
        }
        if (n2İsMin){
            System.out.println(n2 + " is the minimum number ");//if n2 is the minimum number
        }
        if (equal){
            System.out.println("equal");//if is the equal
            //burada 100 is the minimum number çıkar.çünkü diğerleri uymuyor.diğerlerinden bir şey çıkmaz
        }
    }
}
