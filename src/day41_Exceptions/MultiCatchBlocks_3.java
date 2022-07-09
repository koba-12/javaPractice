package day41_Exceptions;

import day39_EncapsulationAndInheritanceRecap.cydeoTask.Employee_2;

public class MultiCatchBlocks_3 {

    public static void main(String[] args) {

/*
Try bloğundaki kod birden fazla exception türü atabiliyorsa(throw aynı zamanda catchin zıttı)
Atılabilecek(throw) tüm olası exception belirtmek için
Parent exception class, child exception classtan önce yerleştirilemez.
 */

        Employee_2 employee=null;

        try {
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("first catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("second catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("fourth catch block");
            e.printStackTrace();
        }
        System.out.println("tested completed");
//üsttekileri tek tek kontrol eder doğru hata kodlarımı diye. en son runtime doğru çıkar.(yahut nullpointException da olabilirdi)
//onun soutu print olur(null pointer exception yazar,runtime exception yazmamıza rağmen.
//ama örneğin başa nullPointerExceptionlı catch block yapsak sadece o çıkardı.
//son olarak da bu parent exception class, child exception classtan önce yerleştirilemez.cümlesi ile söylenmek istenen.
//mesela runtime exception diğer tüm exceptionların(ArithmeticException, IndexOutOfBoundsException vs) parentidir.
//o yüzden runtime exception hep en altta olmalıdır.

        System.out.println("------------------------------");

        try {
            System.out.println("java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}
