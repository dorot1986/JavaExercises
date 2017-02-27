package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Napisz funkcję, która odczytuje 2 liczby i zwraca NWD (a ,b).*/


public class Exercise14 {
    public static void main(String[] args) {
        System.out.println("----Program oblicza największy wspólny dzielnik (NWD) dwóch liczb naturalnych----");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Podaj 2 liczby naturalne:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            greatestCommonDivisorOfNaturalNumbers(a, b);
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }

    public static void greatestCommonDivisorOfNaturalNumbers (int a, int b){
        if (a<0 || b<0) System.out.println("Nie podano liczb naturalnych!");
        else if (a==0 && b==0) System.out.println("Największy wspólny dzielnik dwóch zer nie istnieje!");
        else if (a==0 && b>0) System.out.println("Największy wspólny dzielnik liczb to: " + b);
        else if (a>0 && b==0) System.out.println("Największy wspólny dzielnik liczb to: " + a);
        else {
            int c;
            do {
                c=b;
                b=a%b;
                a=c;
            } while (b!=0);
            System.out.println("Największy wspólny dzielnik liczb to: " + a);
        }
    }
}
