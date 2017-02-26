package arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-23.
 */

//W prowadź n liczb całkowitych do jednowymiarowej tablicy i wyprowadź je na ekran w
//odwrotnej kolejności.


public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów tablicy liczb całkowitych:");
        try{
            int n = sc.nextInt();
            int[] numbers = new int[n];
            System.out.println("Podaj elementy tablicy liczb całkowitych:");
            for (int i=0; i<=n-1; i++){
                numbers[i] = sc.nextInt();
            }
            System.out.println("Elementy tablicy w odwrotnej kolejności to: ");
            for (int j=n-1; j>=0; j--){
                System.out.println(numbers[j]);
            }
        }
        catch(InputMismatchException exception){
            System.out.println("Niepoprawne dane!");
        }
        sc.close();
    }
}
