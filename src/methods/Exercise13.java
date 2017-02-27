package methods;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Napisz funkcję, która odczytuje a i n, i zwraca a do potęgi n.*/


public class Exercise13 {
    public static void main(String[] args) {
        System.out.println("----Program odczytuje liczby całkowite a i n, i zwraca a do potęgi n----");
        System.out.println();
        power();
    }

    public static void power(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Podaj 2 liczby całkowite:");
            int a = sc.nextInt();
            int n = sc.nextInt();
            int result = a;
            if (n>=0){
                if (n == 0) result = 1;
                else if (n == 1) result = a;
                else {
                    for (int i = 2; i <= n; i++) {
                        result = result * a;
                    }
                }
                System.out.println(a +" do potęgi " + n + " to " + result);
            }
            else{
                BigDecimal resultBigDecimal;
                if (a==0){
                    System.out.println("Nie można dzielić przez 0!");
                }
                else if (n == -1) {
                    resultBigDecimal = new BigDecimal(1/a);
                    System.out.println(a +" do potęgi " + n + " to " + resultBigDecimal);
                }
                else{
                    double resultDenominator=a;
                    for (int i = -2; i >= n; i--) {
                        resultDenominator = resultDenominator * a;
                    }
                    resultBigDecimal = new BigDecimal(1/resultDenominator);
                    System.out.println(a +" do potęgi " + n + " to " + resultBigDecimal);
                }
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }
}
