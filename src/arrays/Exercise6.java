package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-24.
 */

/*
Sumy częściowe
Mamy dany ciąg liczb całkowitych: a1, a2, a3, ... an Zdefiniujmy ciąg sum częściowych b: ai+ai+1+...+an Zadaniem Twojego programu jest wyznaczenie ciągu b dla pewnego ciągu a.
Napisz program, który: wczyta ze standardowego wejścia liczbę naturalną n oraz liczby a1, a2, ... an, wypisze na standardowe wyjście b1, b2, ... bn.
Wejście:
W pierwszym wierszu wejścia znajduje się jedna liczba naturalna 1<=n<=50000. W drugim wierszu znajduje się n liczb naturalnych: a1, a2, ...an oddzielonych pojedynczymi odstępami (1<=a<=20000).
Wyjście:
W jedynym wierszu wyjścia należy wypisać oddzielone pojedynczymi odstępami liczby b1, b2, ...bn.
Przykład
Dla danych wejściowych:
4
1 3 2 6
poprawną odpowiedzią jest:
12 11 8 6
Wskazówka: zastanów się, jaka jest zależność między a . Spróbuj się zastanowić, dlaczego jest to lepsze niż zwyczajne liczenie jako .
*/


public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy liczb całkowitych:");
        try {
            int n = sc.nextInt();
            int[] arrayA = new int[n];
            System.out.println("Podaj elementy tablicy:");
            for (int i = 0; i <= n - 1; i++) {
                arrayA[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i <= n - 1; i++) {
                sum = sum + arrayA[i];
            }
            int[] arrayB = new int[n];
            arrayB[0] = sum;
            for (int i = 0; i <= n - 2; i++) {
                arrayB[i+1] = arrayB[i] - arrayA[i];
            }
            for (int i = 0; i <= n - 1; i++) {
                System.out.print(arrayB[i] + " ");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }
}
