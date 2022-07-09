package day24_CustomMethods_Return;

public class ReturnStatement_4 {

    public static void main(String[] args) {

        nameOfDay(10);
    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number){
//returnun iki türü var unutmayalım
//return method: return type is not void MUST return a value
//return statement:methodtan çıkmak için kullanılır return methodlarından bir değer döndürmek için kullanabiliriz.sanırım return statementın void ile kullanılması gerek

        if (number<1|| number>7){
            return;//exits---normalde burada exit için break kullanıyorduk ama bu yöntemde return kullanılır
        }//void olduğu için returnun yanına bir şey yazamayız

        if (number==1){
            System.out.println("monday");
        }else if (number==2){
            System.out.println("tuesday");
        }else if (number==3) {
            System.out.println("wednesday");
        }else if (number==4) {
            System.out.println("thursday");
        }else if (number==5) {
            System.out.println("friday");
        }else if (number==6) {
            System.out.println("saturday");
        }else {
            System.out.println("sunday");
        }

    }
}
