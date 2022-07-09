package day18_NestedLoop;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your username");
        String u = scan.next();

        System.out.println("enter your password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){//eğer buna uygun girilirse logged in
            System.out.println("Logged in");
        }else {//eğer uygun değilse
            for (int i = 1; i < 4; i++) {
                System.out.println("Incoorect username or password");
                System.out.println("Enter your username");
                u = scan.next();
                System.out.println("Enter your password");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")){//yanlıştan sonra doğru girilirse bu out olur
                    System.out.println("Logged in");
                    break;//eğer bunu yazmazsam tekrar üstteki gibi sorar cevap doğru olsa bile
                }
            }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){//ve 3 yanlış yapıp buna uygun değilse serr out olur
                System.err.println("Your account is locked, please contact support team");
            }
        }
        scan.close();
    }

    /*
    2. You are writing a code for the log-in function of the Cydeo
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials.
If credentials are matched, your program should
print "Logged in."
If the credentials are not matched, the program
should allow the user to have three attempts to enter correct credentials
and if all three attempts are failed, then print "Your account is locked."
Nested loop:  loop inside another loop (inner & outer loops)
one iteration of the outer loop, executes all the iteration of the
inner loop
     */
}
