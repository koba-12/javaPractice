package day43_OOPAbstraction.EmployeeTask;

public abstract class Person_1 {

    private String name;
    private int age;
    private char gender;

    public Person_1(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<=0){
            throw new RuntimeException("imvalid age"+age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public abstract void sleep();//burada method olarak abstract kullanmak için classı da abstract yapmalıyız.

    public void eat(){
        System.out.println(name+" is eating baklava");
    }

    @Override//override edeceğiz burayı,employee classa
    public String toString() {
        return "Person_1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
