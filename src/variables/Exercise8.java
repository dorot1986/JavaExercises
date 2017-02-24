package variables;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Napisz program, który oblicza silnię.


public class Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj nieujemną liczbę całkowitą:");
        try{
            int a = sc.nextInt();
            if (a>0){
                int number = 1;
                for (int i=2; i<=a; i++){
                    number = number*i;
                }
                System.out.println("Silnia liczby to: " + number);
            }
            else if(a==0){
                System.out.println("Silnia liczby to: 0");
            }
            else{
                System.out.println("Podałeś niepoprawne dane!");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Podałeś niepoprawne dane!");
        }
        sc.close();
    }
}
