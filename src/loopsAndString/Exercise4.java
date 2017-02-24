package loopsAndString;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Napisz program, który sprawdza czy dany odczytany napis jest w
//poprawnym formacie kodu pocztowego tzn: 87-630 jest w formacie poprawnym,
//        natomiast 8aa-999 jest niepoprawnym kodem pocztowym ( dwie pierwsze cyfry
//        następni myślnik, następnie trzy cyfry).


public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kod pocztowy:");
        String postCode = sc.next();
        sc.close();
        if(Pattern.matches("[0-9]{2}-[0-9]{3}", postCode)){
            System.out.println("Podany kod pocztowy jest poprawny.");
        }
        else{
            System.out.println("Podano niepoprawny kod pocztowy!");
        }
    }
}
