package day20_arrays;

public class AppearedTwice_11 {

    public static void main(String[] args) {

        char [] chars = {'A','A','A','B','C','C','D','D','D'};

        for (int j = 0; j < chars.length; j++) {
            char ch=chars[j];
            int frequency = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i]==ch){
                    frequency++;
                }
            }
            if (frequency==2){//önceki practicein benzeri buraya 2 kere tekrar edeni bulmayı yazdık
                System.out.println(ch);
            }
        }
    }
}
