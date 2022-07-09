package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10,
                b = 20,
                c = 30;
        //if we have three different numbers, one must max,one must min and one must median(mediumla benzer kelime zaten)
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedian = (b > c && b < a) || (b > a && b < c);
        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian){//if a is the median number
            System.out.println(a + " is the median number ");
        }
        if (bIsMedian){//if b is the median number
            System.out.println(b + " is the median number ");
        }
        if (cIsMedian){// if c is the median number
            System.out.println(c + " is the median number ");
        }
    }
}
