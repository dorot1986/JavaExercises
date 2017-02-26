package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-24.
 */

/*
Trzy elementy
Niech dany będzie n-elementowy ciąg liczb całkowitych a. Zadaniem Twojego programu będzie sprawdzenie czy w ciągu jakakolwiek liczba występuje co najmniej trzykrotnie.
Zadanie:
Napisz program, który:
wczyta ze standardowego wejścia liczbę naturalną n oraz liczby a1, a2, ...an,
wypisze na standardowe wyjście TAK jeśli ciąg a zawiera element powtarzający się co najmniej 3 razy lub NIE jeśli nie zawiera.
Wejście:
W pierwszym wierszu wejścia znajduje się jedna liczba naturalna n. W drugim wierszu znajduje się n liczb a1, a2, ... an, będących kolejnymi elementami ciągu. Ponadto -1000000<=a<=1000000 dla dowolnego 1<=i<=n.
Wyjście:
W jedynym wierszu wyjścia powinno się znaleźć jedno słowo: 'TAK' lub 'NIE' (wielkimi literami).
Przykład:
Dla danych wejściowych:
7
1 2 7 2 -6 1 2
poprawną odpowiedzią jest:
TAK
*/


public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy liczb całkowitych:");
        try {
            int n = sc.nextInt();
            int[] array = new int[n];
            System.out.println("Podaj elementy tablicy:");
            for (int i = 0; i <= n - 1; i++) {
                array[i] = sc.nextInt();
            }
            int[] numberOfOccurence = new int[n];
            for (int j=0; j<=n-1; j++){
                for (int k=0; k<=n-1; k++){
                    if (array[j]==array[k]){
                        numberOfOccurence[j]=numberOfOccurence[j]+1;
                    }
                }
            }
            int max = numberOfOccurence[0];
            int index = 0;
            for (int i=0; i<=n-2; i++){
                if (numberOfOccurence[i+1]>max){
                    max = numberOfOccurence[i+1];
                    index = i+1;
                }
            }
            if (max >= 3) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }
}
