package methods;

/**
 * Created by Dorota Marszałek on 2017-02-26.
 */

/*Skorzystaj z wcześniejszej funkcji (Exercise11) do znalezienia liczby od 2 do 10000, która ma
        największą liczbę dzielników.*/


public class Exercise12 {
    public static void main(String[] args) {
        Exercise11 example = new Exercise11();
        int maxNumberOfDividers=0;
        int numberWithMaxDividers=2;
        for (int i=2; i<=10000; i++){
            if (example.numberOfDividers(i)>maxNumberOfDividers) {
                maxNumberOfDividers=example.numberOfDividers(i);
                numberWithMaxDividers = i;
            }
        }
        System.out.println("Spośród liczb od 2 do 10000 największą liczbę dzielników ma liczba: " + numberWithMaxDividers);
        System.out.println(example.numberOfDividers(numberWithMaxDividers));
    }
}
