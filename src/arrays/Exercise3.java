package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-24.
 */

//W tablicy jednowymiarowej znajdź liczbę, która występuje najczęściej.
//Nie obsługuje sytuacji, w której dwie liczby występują najczęściej

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy liczb całkowitych:");
        try{
            int n = sc.nextInt();
            int[] array = new int[n];
            System.out.println("Podaj elementy tablicy:");
            for (int i=0; i<=n-1; i++){
                array[i] = sc.nextInt();
            }
            int[] numberOfOccurence = new int[n];
            for (int j=0; j<=n-1; j++){
                for (int k=0; k<=n-1; k++){
                    if (array[j]==array[k]){
                        numberOfOccurence[k]=numberOfOccurence[k]+1;
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
            System.out.println("Największa liczba wystąpień to: " + max);
            System.out.println("Liczba występująca najczęściej to: " + array[index]);
        }
        catch (InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();

    }
}
