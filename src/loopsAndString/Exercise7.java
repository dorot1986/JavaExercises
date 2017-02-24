package loopsAndString;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Napisz program, który odczytuje liczbę i sprawdza ile dana liczba ma dzielników.


public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą nieujemną:");
        try{
            int number = sc.nextInt();
            sc.close();
            if (number>=0){
                int sum = 0;
                for (int i=1; i<=number; i++){
                    if (number%i==0){
                        sum = sum + 1;
                    }
                }
                if (sum==1){
                    System.out.println("Podana liczna ma " + sum + " dzielnik.");
                }
                else if ((sum>=2 && sum <=4)){
                    System.out.println("Podana liczna ma " + sum + " dzielniki.");
                }
                else{
                    System.out.println("Podana liczna ma " + sum + " dzielników.");
                }
            }
            else{
                System.out.println("Niepoprawna liczba!");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }



    }
}
