package day35_OOPEncapsulation.encapsulation;

public class Person {

    private String name;
    private int age;

    public String getName(){//privatei buna döndürdü.parantez içi boş olur.
        return name;//buradaki name yazan yerde üstte yazan variableslardan biri olmalıdır.
    }

    public void setName(String name){//parantez içinde üstteki instance variablestan biri olmalıdır.
        this.name=name;
    }
    //ikisinde de static kullanılamaz


    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age<=0 || age>150){
            System.err.println("invalid age: "+ age);
            System.exit(0);//bu şekillerde de condiion koyabiliriz
        }
        this.age=age;
    }

}
