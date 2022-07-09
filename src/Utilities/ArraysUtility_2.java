package Utilities;

import day25CustomMethods_OverLoading.AddElementsToArray_Overloading_5;
import day26_CustomMethodsPractice.FrequencyOfElement_1;

import java.util.Arrays;

public class ArraysUtility_2 {

    /*
    NOT!!! OVERLOADİNG OLMASI İÇİN BÖYLE İNT,DOUBLE,CHAR,STRİNG YAZIYORUZ
     */

    //bir tamsayı dizisinin her bir tamsayısını ayrı satırlara yazdır

    public static void printEachElement(int[]array){
        for (int each : array) {
            System.out.println(each);
        }
    }
//bir double dizisinin her bir double ayrı satırlara yazdır
    public static void printEachElement(double[]array){
        for (double each : array) {
            System.out.println(each);
        }
    }

//bir char dizisinin her bir char ayrı satırlara yazdır

    public static void printEachElement(char[]array){
        for (char each : array) {
            System.out.println(each);
    }
}
    //bir string dizisinin her bir string ayrı satırlara yazdır
    public static void printEachElement(String []array){
        for (String each : array) {
            System.out.println(each);
        }
    }//aynı isimli 4 farklı method




//returns the max number of integer array

    public static int max(int[]numbers){//burada spesific data olduğu için void değil int kullandık dedi.tam anlamadım tekrar yaparız
        Arrays.sort(numbers);//küçükten büyüğe sıralattık burada
        return numbers[numbers.length-1];//ve o sıralamanın sonuncusunu istedik
    }
//returns the max number of double array
    public static double max(double[]numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


//mini bulalım
    public static int min(int[]numbers){
        Arrays.sort(numbers);//küçükten büyüğe sıralattık
        return numbers[0];//sıralattıktan sonra 0. elementi istedik
    }

    public static double min(double[]numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }





//verilen tamsayının verilen dizide bulunup bulunmadığını kontrol edin, boolean değerini döndürür.containsint[],int

    public static boolean contains(int[]array,int element){//nerelerde void nerelerde int,double,boolean vs kullanıldığına dikkat edelim ve tam olarak öğrenelim
        //ayrıca void kullanılınca return kullanılmıyor,diğerlerinde kullanılıyor
        boolean result=false;//burada deklare ettik//cevap her zaman false çıkar ancak...

        for (int each : array) {//girdileri looplarız
            if (each==element){//üstte her zaman false çıkar demiştik ancak bu conditiona uygunsa true çıkar.
                result=true;
            }
        }
        return result;//test_8 e bakarsak daha iyi anlarım

    }

    //verilen doubleın verilen dizide bulunup bulunmadığını kontrol edin, boolean değerini döndürür.containsdouble[],int

    public static boolean contains(double[]array,double element){//nerelerde void nerelerde int,double,boolean vs kullanıldığına dikkat edelim ve tam olarak öğrenelim
        //ayrıca void kullanılınca return kullanılmıyor,diğerlerinde kullanılıyor
        boolean result=false;//burada deklare ettik//cevap her zaman false çıkar ancak...

        for (double each : array) {//girdileri looplarız
            if (each==element){//herhangi bir dizi öğesi verilen öğeyle eşleşiyorsa,bu, verilen öğelerin arrayde yer aldığı anlamına gelir
                result=true;
            }
        }
        return result;

    }

    //verilen charın verilen dizide bulunup bulunmadığını kontrol edin, boolean değerini döndürür.containschar[],int

    public static boolean contains(char[]array,char element){//nerelerde void nerelerde int,char,boolean vs kullanıldığına dikkat edelim ve tam olarak öğrenelim
        //ayrıca void kullanılınca return kullanılmıyor,diğerlerinde kullanılıyor
        boolean result=false;//burada deklare ettik//cevap her zaman false çıkar ancak...

        for (char each : array) {//girdileri looplarız
            if (each==element){//üstte her zaman false çıkar demiştik ancak bu conditiona uygunsa true çıkar.
                result=true;
            }
        }
        return result;

    }

    //verilen Stringın verilen dizide bulunup bulunmadığını kontrol edin, boolean değerini döndürür.containsString[],int

    public static boolean contains(String[]array,String element){//nerelerde void nerelerde int,String,boolean vs kullanıldığına dikkat edelim ve tam olarak öğrenelim
        //ayrıca void kullanılınca return kullanılmıyor,diğerlerinde kullanılıyor
        boolean result=false;//burada deklare ettik//cevap her zaman false çıkar ancak...

        for (String each : array) {//girdileri looplarız
            if (each.equals(element)){//BURAYA DİKKAT DİĞERLERİNDE == VAR BURADA İSE EQUALS METHOD KULLANDIK.ÇÜNKÜ STRİNGDE EŞİTLİK DEĞİL EQUALS KULLANILIR
                result=true;
            }
        }
        return result;

    }

    public static int []uniqueElements(int[]array){
        int[]result={};//geçici bir başlangıç noktası için//new int [0]

        for (int each : array) {
            if (FrequencyOfElement_1.frequencyOfElement(array,each)==1){//unique elements i bulmak için yeni kodlar yazmadık
                //önceki yazdıklarımızı kısayol gibi ekledik
                result= AddElementsToArray_Overloading_5.addElement(result,each);

            }
        }

        return result;
    }

    public static double []uniqueElements(double[]array){
        double[]result={};//geçici bir başlangıç noktası için//new double [0]

        for (double each : array) {
            if (FrequencyOfElement_1.frequencyOfElement(array,each)==1){//unique elements i bulmak için yeni kodlar yazmadık
                //önceki yazdıklarımızı kısayol gibi ekledik
                result=AddElementsToArray_Overloading_5.addElement(result,each);

            }
        }

        return result;
    }

    public static char []uniqueElements(char[]array){
        char[]result={};//geçici bir başlangıç noktası için//new char [0]

        for (char each : array) {
            if (FrequencyOfElement_1.frequencyOfElement(array,each)==1){//unique elements i bulmak için yeni kodlar yazmadık
                //önceki yazdıklarımızı kısayol gibi ekledik
                result=AddElementsToArray_Overloading_5.addElement(result,each);

            }
        }

        return result;
    }

    public static String []uniqueElements(String[]array){
        String[]result={};//geçici bir başlangıç noktası için//new String [0]

        for (String each : array) {
            if (FrequencyOfElement_1.frequencyOfElement(array,each)==1){//unique elements i bulmak için yeni kodlar yazmadık
                //önceki yazdıklarımızı kısayol gibi ekledik
                result=AddElementsToArray_Overloading_5.addElement(result,each);

            }
        }

        return result;
    }




    public static int[]removeElement(int[]array,int index) {

        if (index < 0 || index > array.length - 1) {//bunu en son ekledik.bu da eğer geçerli olmayan bir index no girersek hata vermesi için
            System.err.println("invalid index" + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];//result=yukarıda yazacağım array

        int j = 0;//burası şuanki resultümüzün index numberı(başlama noktası)

        for (int i = 0; i < array.length; i++) {//arrayi looplatıyoruz
//buraya ilk önce for each loop yazdık ama sonra hatalı olduğunu gark edip değiştirdik.çükü for each loop only checks elements dedi
//ama biz burada index number arıyoruz
            if (i == index) {//eğer loopta arrayin yazılan indexi gelirse onu atlıyoruz.(continue ile)
                //if the index of array is matching with at given index

                continue;//skip
            }
            result[j++] = array[i];//yeni resultümüz looplanan arrayin içinden çıkarılan sayı ile gelen yeni sonuç
        }
        return result;

    }

    public static double[]removeElement(double[]array,double index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number"+index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (i == index) {

                continue;//skip
            }
            result[j++] = array[i];
        }
        return result;

    }


    public static char[]removeElement(char[]array,char index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number"+index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (i == index) {

                continue;//skip
            }
            result[j++] = array[i];
        }
        return result;

    }


    public static String[]removeElement(String[]array,int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid index number"+index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];

        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (i == index) {

                continue;//skip
            }
            result[j++] = array[i];
        }
        return result;

    }



    //verilen 2 arrayi birleştirin ve yeni bir arraye döndürün

    public static int[]merge(int[]arr1,int[]arr2){
        int[]result={};//üstteki 2 arrayin oluşturacağı yeni array için

        for (int each : arr1) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);//controle basılı tutup üstüne gelmeyi dene,kısayol var yine
        }
        for (int each : arr2) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);
        }
        return result;
    }

    public static double[]merge(double[]arr1,double[]arr2){
        double[]result={};

        for (double each : arr1) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);//controle basılı tutup üstüne gelmeyi dene,kısayol var yine
        }
        for (double each : arr2) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);
        }
        return result;
    }

    public static char[]merge(char[]arr1,char[]arr2){
        char[]result={};

        for (char each : arr1) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);//controle basılı tutup üstüne gelmeyi dene,kısayol var yine
        }
        for (char each : arr2) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);
        }
        return result;
    }

    public static String[]merge(String[]arr1,String[]arr2){
        String[]result={};

        for (String each : arr1) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);//controle basılı tutup üstüne gelmeyi dene,kısayol var yine
        }
        for (String each : arr2) {
            result=AddElementsToArray_Overloading_5.addElement(result,each);
        }
        return result;
    }





    public static int[] addElement(int[] array, int element) {

        int[] result = new int[array.length + 1];//5 i eklemesi için

        int i = 0;
        for (int each : array) {//burada looplattık arrayin içini,diikat bu loopta neleri yazdığımıza
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }

    public static double[] addElement(double[] array, double element) {//üsttekinin aynısının double ı
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {//burada looplattık arrayin içini
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }

    public static String[] addElement(String[] array, String element) {//üsttekinin aynısının String ı
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {//burada looplattık arrayin içini
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }

    public static char[] addElement(char[] array, char element) {//üsttekinin aynısının char ı
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {//burada looplattık arrayin içini
            result[i++] = each;
        }
        result[i] = element;//resultü elemente eşledik
        return result;
    }






    //arrayi tersine çevirir,yeni bir arraye dönüştürür
    public static int[]reverse(int[]array){

        int[]result=new int[array.length];//bu yeni array için
        int j=0;//j yi oluşturmuş olduk bu reverse ü temsil edecek
        for (int i = array.length - 1; i >= 0; i--) {//i yi yani arrayimizi sondan başa doğru loopladık
            result[j++]=array[i];//böylece yeni arrayimiz = i nin yani önceki arrayin sondan başa doğru loopudur
        }
        return result;
    }

    //arrayi tersine çevirir,yeni bir arraye dönüştürür
    public static double[]reverse(double[]array){

        double[]result=new double[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }

    //arrayi tersine çevirir,yeni bir arraye dönüştürür
    public static char[]reverse(char[]array){

        char[]result=new char[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }

    //arrayi tersine çevirir,yeni bir arraye dönüştürür
    public static String[]reverse(String[]array){

        String[]result=new String[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];
        }
        return result;
    }






    //verilen indexteki arrayin elementini yeni elementle değiştirin
    //  {1,2,3,4,5}       2           30
    public static int[]replace(int[]array,int index,int newElement){//replace yapmak için bu 3 parameterı girdik

        if (index<0||index> array.length-1){//replace yapılacak yani yer değiştirelecek sayının index nosunu ayarladık
            System.err.println("invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;//main methodda index bölümüne yazacağımız index nolu sayıyı newelemente eşitledik.
        //yani bu şu anlama geliyor main methodda yazacağım newelement yine main methoda yazacağım index numarasının yeni sahibi olacak.eski sahibinin yerine
        return array;
    }
    //NOT: DOUBLE,CHAR VE STRİNGİ İNT'İ KOPYALAYARAK OLUŞTURDUĞUM İÇİN FAZLA YER KAPLAMASIN DİYE TÜRKÇE AÇIKLAMALARI KASITLI SİLİYORUM
    public static double[]replace(double[]array,int index,double newElement){
        //!!!index number is always an integer(int)    //index numarası her zaman tam sayıdır
        if (index<0||index> array.length-1){
            System.err.println("invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static char[]replace(char[]array,int index,char newElement){
        //index number is always an integer(int)!!!       //index numarası her zaman tam sayıdır
        if (index<0||index> array.length-1){
            System.err.println("invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }

    public static String[]replace(String[]array,int index,String newElement){
        //index number is always an integer(int)!!!   //index numarası her zaman tam sayıdır

        if (index<0||index> array.length-1){
            System.err.println("invalid index"+index);
            System.exit(0);
        }
        array[index]=newElement;
        return array;
    }







    //eşleşen tüm old value ları new value ile değiştir.
    public static int[]replaceAll(int[]array,int oldValue,int newValue){

        for (int i = 0; i < array.length; i++) {//yazacağımız şeyi looplatmak için yazdık bu kodu
            if (array[i]==oldValue){//bir de condition koyduk.eğer loopa giren array üyeleri old value ise
                array[i]=newValue;//o element artık newvalueya eşit olur.
            }
        }
        return array;
    }

    //eşleşen tüm old value ları new value ile değiştir.
    public static double[]replaceAll(double[]array,double oldValue,double newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    //eşleşen tüm old value ları new value ile değiştir.
    public static char[]replaceAll(char[]array,char oldValue,char newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }

    //eşleşen tüm old value ları new value ile değiştir.
    public static String[]replaceAll(String[]array,String oldValue,String newValue){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)){//buraya dikkat String olduğu için .equals kullandık
                array[i]=newValue;
            }
        }
        return array;
    }






    //verilen arraydeki kopyaları kaldırır,yeni bir arraye döndürür.
    //{1,1,2,2,3,3}
    public static int[]removeDuplicates(int[]array){

        int[]result={};//geçici

        for (int each : array) {
            if (!ArraysUtility_2.contains(result,each)){
                result=ArraysUtility_2.addElement(result,each);
            }
        }
        return result;
    }

    //verilen arraydeki kopyaları kaldırır,yeni bir arraye döndürür.
    //{1,1,2,2,3,3}
    public static double[]removeDuplicates(double[]array){

        double[]result={};//geçici

        for (double each : array) {
            if (!ArraysUtility_2.contains(result,each)){
                result=ArraysUtility_2.addElement(result,each);
            }
        }
        return result;
    }

    //verilen arraydeki kopyaları kaldırır,yeni bir arraye döndürür.
    //{1,1,2,2,3,3}
    public static char[]removeDuplicates(char[]array){

        char[]result={};//geçici

        for (char each : array) {
            if (!ArraysUtility_2.contains(result,each)){
                result=ArraysUtility_2.addElement(result,each);
            }
        }
        return result;
    }

    //verilen arraydeki kopyaları kaldırır,yeni bir arraye döndürür.
    //{1,1,2,2,3,3}
    public static String[]removeDuplicates(String[]array){

        String[]result={};//geçici

        for (String each : array) {
            if (!ArraysUtility_2.contains(result,each)){
                result=ArraysUtility_2.addElement(result,each);
            }
        }
        return result;
    }




}
