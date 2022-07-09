package day09_IfStatements;

public class MultiBranchIfStatementsPosNegZero {
    public static void main(String[] args) {

        /*multi branch, else if e yan cümle oluşturmak için iç içe yerleştirilebilir
        birkaç alternatif arasından karar vermek için kullanılır
        gerekirse birden fazla else if bloğu verilebilir
        3 veya daha fazla seçenek/olasılık olduğunda kullanılır
        formülü =(formülde gördüğümüz gibi eğer son satır değilse else if yazıyoruz ara satırlara)
        if(condition1){
            statementA
        }else if(condition2){
            statementB
        }else {
            statementC
        }
        statementA = doğru olmak zorunda(must be true)
        statementB = condition1 yanlış olmak zorunda,condition 2 doğru olmaz zorunda
        statementC = condition1&condition2 yanlış olmak zorunda
         */

        int n = 100;

        if (n > 0){
            System.out.println("Positive");//positive
        }
        if (n < 0){
            System.out.println("Negative");
        }
        if (n == 0){
            System.out.println("Zero");
        }

        System.out.println("------------------------------------");

        boolean positive = n > 0;
        boolean negative = n < 0;

        if (positive){
            System.out.println("Positive");
        }else if (negative){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        System.out.println("-------------------------------");

        if (positive){
            System.out.println("positive");
        }
        if (negative){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
        //bu işlemde önce positive sonra zero çıkar.zero çıkmasının sebebi 100 sayısı negative ve zero değil
        //ama else zero olduğundan sanırım emin değilim
        //!!! if&else ifadesine 2den fazla koşul gerektiren durumlar için asla başvuramayız
    }
}
