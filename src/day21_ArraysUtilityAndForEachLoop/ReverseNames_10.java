package day21_ArraysUtilityAndForEachLoop;

public class ReverseNames_10 {

    public static void main(String[] args) {

        String []names={"elminur ablimit","ali kilic","hulya keles","sinem kaya","begench begenjov","ruveyda durna",
                "jonathan holly", "alshaun rodgers", "manas kalenov","gulsen sohret"};



        for (String each : names) {
            String reversed="";

            for (int i = each.length()-1; i >=0 ; i++) {//tersten looplamasını sağladık-stringi tersine çevirttik
                reversed+=each.charAt(i);//reversedi i nin char atine eşitledik
            }
            System.out.println(reversed);
        }
    }
}
