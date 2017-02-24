package variables;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Napisz program, który odczytuje dwie zmienne i na ekran wypisuje komunikat
//        sprawdzający czy obie zmienne są równe.


public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dwie liczby całkowite:");
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a==b){
                System.out.println("Podane liczby są równe");
            }
            else{
                System.out.println("Podanie liczby nie są równe");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Podałeś niepoprawne dane!");
        }
        sc.close();
    }
}
