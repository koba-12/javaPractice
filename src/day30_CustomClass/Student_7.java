package day30_CustomClass;

public class Student_7 {

    public String name;//bunlar instance variables
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public void setInfo(String name, char gender,int age,int ID,char grade){//setInfo methodumuz
        this.name=name;//instance variablesı çağırmak için kullanılır-sanırım bu tarz 2 aynı şey olunca kullanılıyor olabilir
        this.gender=gender;//bak instance variable ın rengi de farklı
        this.age=age;//this sayesinde instance variables a dönüştüler
        this.ID=ID;
        this.grade=grade;
        //kısayolu da yine toStringe benziyor.sağ click yapıp constructor diyip seçiyoruz
    }

    public String toString() {
        return "Student_7{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }



    public void code(){//code method-ismi code sadece özel bir method değil ama yine de method
        System.out.println(name+ " is coding");
    }

    public void sleep(){//sleep method
        System.out.println(name+" is seleeping");
    }




}
