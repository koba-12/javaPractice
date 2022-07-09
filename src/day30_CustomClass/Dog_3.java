package day30_CustomClass;

public class Dog_3 {

        public String name;//bunlar instance variables
        public String breed;
        public int age;
        public char gender;
        public String size;
        public String color;
        //farklı dog objectleri


        public void setInfo(String dogName,String dogBreed,int dogAge, char dogGender, String dogSize,String dogColor ){
                name=dogName;
                breed=dogBreed;
                age=dogAge;
                gender=dogGender;
                size=dogSize;
                color=dogColor;
                //bunu da DogObjext de çalışma yapacağız oradan takşp edelim
        }


        public void eat(){
            System.out.println(name+"is eating");
        }

        public void bark(){
            System.out.println(name+"is barking");
        }//farklı dog methodları

    //üstteki object ve methodlar custom classı oluşturdu.

        public String toString() {//buraya sağ click yapıp generate==>toString==> insert yazanı kapattık.
                //bu shortcuttır bu sayede altta yazılanlar oto çıktı.
                //toString method instance methoddur
                return "Dog_3{" +
                        "name='" + name + '\'' +
                        ", breed='" + breed + '\'' +
                        ", age=" + age +
                        ", gender=" + gender +
                        ", size='" + size + '\'' +
                        ", color='" + color + '\'' +
                        '}';
        }
}
