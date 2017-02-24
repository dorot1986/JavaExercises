package loopsAndString;

import java.util.Scanner;

/**
 * Created by Dorota Marszałek on 2017-02-22.
 */

//Stwórz program, który odczytuję dany napis i wypisuje ile razy w danym
//napisie występują małe litery.
//        Przykładowo dla napisu:
//        aAaaBssk wynikiem powinno być 6 (małe a występuje 3 razy, s występuje 2 razy, k
//        występuje 1 raz).


public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst:");
        String text = sc.next();
        sc.close();
        int sum = 0;
        for (int i=0; i<=text.length()-1; i++){
            if ((text.charAt(i)>='a' && text.charAt(i)<='z') || text.charAt(i)=='ą' || text.charAt(i)=='ć' || text.charAt(i)=='ę'
                    || text.charAt(i)=='ł' || text.charAt(i)=='ń' || text.charAt(i)=='ó' || text.charAt(i)=='ś' || text.charAt(i)=='ż'
                    || text.charAt(i)=='ź'){
                sum=sum+1;
            }
        }
        System.out.println(sum);
    }
}
