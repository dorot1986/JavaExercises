package variables;

import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Napisz program, który odczytuje dany wyraz z konsoli tak długo aż natrafi na
//poprawnie wprowadzone hasło.


public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        String correctPassword = "TrudneHaslo_1234";
        do{
            System.out.println("Podaj hasło:");
            password = sc.next();
        }while (!password.equals(correctPassword));
        System.out.println("Podane hasło jest poprawne.");
        sc.close();
    }
}
