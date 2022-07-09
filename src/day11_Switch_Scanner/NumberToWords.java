package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {


        int number = 7;//1-9 arası olmasını isteyen bir task ve ternaties istiyor


        String result = (number>=0 && number <= 9)?//bu bizim if bloğumuz pre-condition-ternaries yaparken böyle oldu
                // buraya string int gibi ifadelerle başlamasının sebebi nedir?sevnura sor
                                            (number==0)? "zero" :(number == 1)? "one" :(number == 2)? "two"
                                            :(number == 3)? "three" :(number == 4)? "four" :(number == 5)? "five"
                                            :(number == 6)? "six":(number == 7)? "seven" :(number == 8)? "eight" : "nine"
                        :"invalid number";// bu da else bloğumuz yine ternaries sebebiyle
        System.out.println(result);//tüm bunlar ternaries biçimi ve cevap seven.aynı normal bloklu(satırlı) if else gibi
        //düşünelim ama yan yana ve daha kısayolla yazdık

    }
}
