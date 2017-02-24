package variables;

import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Napisz program, który odczytuje imię i sprawdza czy jest ono palindromem.


public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String name = sc.next();
        int sum = 0;
        for(int i=0; i<=name.length()-1; i++){
            if (name.charAt(i)==name.charAt(name.length()-1-i)){
                sum =sum+1;
            }
        }
        if (sum==name.length()){
            System.out.println("Podane imię jest palindromem.");
        }
        else {
            System.out.println("Podane imię nie jest palindromem.");
        }
    }
}
