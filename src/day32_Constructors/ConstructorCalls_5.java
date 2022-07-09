package day32_Constructors;

public class ConstructorCalls_5 {

        public ConstructorCalls_5(){
            System.out.println("default constructor");
        }

        public ConstructorCalls_5(int a){
            this();//default constructor
            System.out.println("constructor with int argument");
        }
        public ConstructorCalls_5(String str){
            this(10);//default constructor,constructor with int argument
            System.out.println("constructor with String argument");
        }

    public static void main(String[] args) {

            ConstructorCalls_5 obj1=new ConstructorCalls_5();//default constructor

        System.out.println("---------------------------------------------");

        ConstructorCalls_5 obj2=new ConstructorCalls_5(5);//default constructor
                                                            // constructor with int argument

        System.out.println("------------------------------------------------------");

        ConstructorCalls_5 obj3=new ConstructorCalls_5("java");//default constructor
                                                                // constructor with int argument
                                                                //constructor with String argument
    }
}
