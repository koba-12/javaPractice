package day20_arrays;

public class UniqueElements_10 {

    public static void main(String[] args) {

        String [] words={"java","java","C","python","python"};

        for (int j = 0; j < words.length; j++) {

            String element=words[j];
            int frequency=0;
            for (int i = 0; i < words.length; i++) {//arrayden elementin frequencysini bulur
                if (words[i].equals(element)){
                    frequency++;
                }
            }
            if (frequency==1){//1kere tekrarlayanı bulmak için 1 yazdık
                System.out.println(element);
            }
        }
    }
}
