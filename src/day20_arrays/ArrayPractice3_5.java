package day20_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3_5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("how many numbers would you like to enter");//girmek istediğim sayıyı soruyorum
        int length=scan.nextInt();

        if (length<=0){//length 0dan küçük eşitse aşağıdaki entryler out
            System.err.println("invalid entry");
            System.exit(0);
        }
        int[]numbers=new int[length];//array oluşturduk-arrayın, kullanıcının gireceği tüm elementleri içerecek kadar kapasiteye sahip olması gerekir
        for (int i = 0; i < length; i++) {//i length den küçük olduğu sürece looplar
            System.out.println("enter a number");
            numbers[i]=scan.nextInt();//llopun her yürütülmesi sırasında sağlanan her girdi kullanıcısı arrayın indexine atanacaktır
        }
        System.out.println(Arrays.toString(numbers));//outa ilk önce ilk sout çıkar.cevap sayısı kadar enter a number gelir
//çünkü arrayi scane eşitledik.yani length bizim toplam element sayımız.en son enter a number cevapları bitince[10,20,30,40,50]gibi örneğin sonuç verir
        scan.close();
    }
}
