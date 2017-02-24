package variables;

import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Napisz program, który odczytuję imię i wypisuję na ekran ostatnią literę imienia.


public class Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String name = sc.next();
        System.out.println("Ostatnia litera podanego imienia to: " + name.charAt(name.length()-1));
        sc.close();
    }
}
