package day42_Exceptions;

class FadyException extends RuntimeException{//custom unchecked exception

    public FadyException(){
        super("time for a short break");
    }

    public FadyException(String message){
        super(message);
    }
//üst taraf custom unchecked exception
}

class NoBreakException extends Exception{//custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args) {

        //throw new FadyException("its time for lunch break");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }
}
