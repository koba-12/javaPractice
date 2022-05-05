package day44_OOPAbstraction.animalTask;

public abstract class Animal_1 {

    private String name;
    private final String breed;//static kullandığımız yerler yerine final kullanmaya başladık.değişmeyen sabit şeyler için.
    private final char gender;
    private int age;
    private String size;
    private final String colour;

    public final static boolean canBreath;

    static {
        canBreath=true;
    }

    public Animal_1(String name, String breed, char gender, int age, String size, String colour) {
        setName(name);
        this.breed = breed;
        if (gender=='M'||gender=='F') {
            throw new RuntimeException("invalid gender "+gender);
//nedenini tam olarak anlamadım ama bu şekilde constructor içine if condiition yazmak aşağıda settera yazmaktan daha avantajlı.
//belki subclasslarda setter ile değişim yapabilmemizle ilgili olabilir.
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            throw new RuntimeException("invalid name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }
    public abstract void eat();
//eat(); ==> different animals eat different foodsistiyor task bizden.drink için ise all the animals drink water şeklinde
//istiyor.o yüzden drinki normal method şeklinde yazdık.eati ise different foods olduğu için bu şekilde yazdık ve bu şekilde
//her animalın kendi classında,kendine özel bir eat methodu yazabileceğiz.bu işlemin adı abstract methoddur.
//abstract methodun comp err vermemesi için classı da abstract classa döndürmeliyiz.

    @Override
    public String toString() {
        return getClass().getSimpleName() +//buradan animalı silip bunları yazdım.sanırım classın adı değişirse
                // bu sayede her yerden otı değişmiş olacak.optional.
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
/*
Warmup task:
Animal Task:
Create an abstract class named Animal:
Variables:
name, breed(final), gender(final),
age, size, color(final)
Encapsulate all the fields
Add a cosntructor that can set all the fields
Methods:
eat(); ==> different animals eat different foods
drink() ==> all the animals drink water
toString() ==> to display the full info
of the animal
Create the following subclasses of Animal:
Dog
eat(): eats Pizza
Cat
eat(): eats Biryani
Tiger
eat(): eats deer
Parrot
eat(): eats chocolate
Eagle
eat(): eats snake
 */
