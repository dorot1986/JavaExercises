package variables;

import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Napisz program, który wypisuje co drugą literę imienia.


public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String text = sc.next();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<=text.length()-1; i++){
            if(i%2==0){
                stringBuilder.append(text.charAt(i));
            }
        }
        System.out.println(stringBuilder);
        sc.close();
    }
}
