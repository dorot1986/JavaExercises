package loopsAndString;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Stwórz program, który sprawdza czy wprowadzone imię jest męskie czy
//żeńskie.


public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String name = sc.next();
        sc.close();
        if (Pattern.matches("[a-zA-ZąćęłńóśźżĄĘŁŃÓŚŹŻ]+", name)==false ){
                //Pattern.matches("[a-zA-Z]", name)==false ){
            System.out.println("Niepoprawne dane!");
        }
        else if (name.charAt(name.length()-1)=='a'){
            System.out.println("Podane imię jest żeńskie.");
        }
        else{
            System.out.println("Podane imię jest męskie.");
        }

    }
}
