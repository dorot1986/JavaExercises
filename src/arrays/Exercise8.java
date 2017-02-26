package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-25.
 */

/*
Modulo
Zuzia lubi zadania matematyczne. Ostatnio dowiedziała się, że X mod Y to reszta z dzielenia X przez Y. Poprosiła Antka, żeby jej podał 15 liczb, a ona szybko obliczy, ile jest różnych reszt z dzielenia tych liczb przez 37. Pomóż Zuzi wykonać zadanie.
Zadanie
Napisz program, który:
wczyta ze standardowego wejścia 15 liczb,
wypisze na standardowe wyjście liczbę różnych reszt z dzielenia tych liczb przez 37.
Wejście
Wejście zawiera 15 liczb całkowitych ni(1<=ni<=10000), po jednej w każdym wierszu.
Wyjście
Program powinien wypisać liczbę różnych reszt z dzielenia wczytanych liczb przez 37.
Przykład
Dla danych wejściowych:
1
38
39
75
76
77
112
113
114
115
149
150
151
153
154
poprawną odpowiedzią jest:
6
*/


public class Exercise8 {
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
            int[] arrayOfRemainders = new int[n];
            for (int i = 0; i <= n - 1; i++) {
                arrayOfRemainders[arrayA[i]%37]=1;

            }
            int sum =0;
            for (int i=0; i<=n-1; i++){
                if (arrayOfRemainders[i]>0){
                    sum = sum + 1;
                }
            }
            System.out.println("Liczba różnych reszt z dzielenia liczb przez 37 to: " + sum);
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }
}
