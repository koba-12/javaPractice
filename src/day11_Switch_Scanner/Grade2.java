package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        //bu da işimize yarayabilecek bir kısayol birden fazla geçerli olmasını istediğimiz şey varsa zaten
        // break yazılmayacak sout da yazmıyoruz en sonuncunun altına yazıyoruz

        char ch = 'A';
        String result = "";

        switch (ch){

            case 'A':// caseler yanyana da yazılabilir
            case 'B':
            case 'C':
            case 'D':
                result = "passed";
                break;
            case 'F':
                result = "failed";
                break;

            default:
                result = "invalid";

        }
        System.out.println(result);
    }
}
