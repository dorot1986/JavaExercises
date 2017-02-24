package loopsAndString;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Napisz program, który sumuje wszystkie liczby od 1 do 100.


public class Exercise3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=1; i<=100; i++){
            sum=sum+i;
        }
        System.out.println("Suma liczb od 1 do 100 to: " + sum);
    }
}
