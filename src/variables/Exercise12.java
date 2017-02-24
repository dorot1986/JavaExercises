package variables;

import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Napisz program, który odczytuje napis i wypisuje go wspak.


public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj napis:");
        String text = sc.next();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=text.length()-1; i>=0; i--){
            stringBuilder.append(text.charAt(i));
        }
        System.out.println(stringBuilder);
        sc.close();
    }
}
