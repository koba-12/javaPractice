package day20_arrays;

public class AverageNumbers_9 {

    public static void main(String[] args) {
        //average ortalama demek
        int[] numbers={10,20,30,40,50,60};
        double sum = 0;//sum toplamı demek

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        double averageNumber=sum/numbers.length;
        System.out.println("averageNumber = " + averageNumber);
    }
}
