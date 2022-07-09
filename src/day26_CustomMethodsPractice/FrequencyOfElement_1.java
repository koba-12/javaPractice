package day26_CustomMethodsPractice;

public class FrequencyOfElement_1 {

    public static void main(String[] args) {

        int[]arr={1,1,1,2,11,22,33,4,1,2,1,2,1,1,1,4,1};

        int n=frequencyOfElement(arr,1);
        System.out.println(n);
    }

    //                                 (1,1,1,1,2,3,4)   1
    public static int frequencyOfElement(int[]array,int element){//verilen elementin frekansını verilen arraye döndürür
        int count=0;

        for (int each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }
    public static int frequencyOfElement(double[]array,double element){//verilen elementin frekansını verilen arraye döndürür
        int count=0;//burası int kalır.double yazarsak hata verir çünkü return type methodu int buranın

        for (double each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(char[]array,char element){//verilen elementin frekansını verilen arraye döndürür
        int count=0;

        for (char each : array) {
            if (each==element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[]array,String element){//verilen elementin frekansını verilen arraye döndürür
        int count=0;

        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }

}
/*
1. Create a class named FrequencyOfElement:
1.1 Create a method that passes two parameters: an integer array and an Integer element. The method returns
the frequency of the given integer element from the integer array
1.2 Create a method that passes two parameters: a double array and a double element. The method returns the
frequency of the given integer from the array
1.3 Create a method that passes two parameters: a char array and a char element. The method returns the
frequency of the given char element from the char array
1.4 Create a method that passes two parameters: a String array and a String element. The method returns the
frequency of the given String element from the String array
 */
