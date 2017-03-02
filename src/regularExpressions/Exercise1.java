package regularExpressions;

import java.util.regex.Pattern;

/**
 * Created by Dorota Marszałek on 2017-03-02.
 */

/*Stwórz wyrażenie które sprawdzi:
        - Czy pierwsze trzy znaki są dowolne, zaś następne 3 znaki tylko cyframi?
        - Czy string zawiera tylko cyfry?
        - Czy string zawiera tylko litery?
        - Czy string zawiera tylko cyfry i litery?
        - Czy string zawiera tylko cyfry i ma dokładnie 5 znaków?
        - Czy string rozpoczyna się od "J"?
        - Czy string rozpoczyna się od "J" i kończy na "U"?
        - Czy string rozpoczyna się od wielkiej litery?
        - Czy string zawiera spację? (biały znak)?
        - Czy string jest numerem telefonu zaczynającym się od 7 lub 8 lub 9?
        - Czy string jest numerem bankowym? (Zakładając, że zaczyna się od dwóch liter, następnie 4 grupy po 4 cyfry)
        - Czy string jest kodem pocztowym?*/


public class Exercise1 {
    public static void main(String[] args) {
        //Czy pierwsze trzy znaki są dowolne, zaś następne 3 znaki tylko cyframi?
        System.out.println(Pattern.matches(".{3}[0-9]{3}", "1a 333"));
        System.out.println(Pattern.matches(".{3}\\d{3}", "aa3333"));
        //Czy string zawiera tylko cyfry?
        System.out.println(Pattern.matches("[0-9]+", "123"));
        System.out.println(Pattern.matches("\\d+", "123"));
        //Czy string zawiera tylko litery?
        System.out.println(Pattern.matches("[a-zA-Z]+", "aAA"));
        System.out.println(Pattern.matches("\\D+", "aAa"));
        //Czy string zawiera tylko cyfry i litery?
        System.out.println(Pattern.matches("[a-zA-Z0-9]+", "aAA11"));
        System.out.println(Pattern.matches("\\w+", "aAa1"));
        //Czy string zawiera tylko cyfry i ma dokładnie 5 znaków?
        System.out.println(Pattern.matches("\\d{5}", "12113"));
        //Czy string rozpoczyna się od "J"?
        System.out.println(Pattern.matches("J.*", "J132//"));
        //Czy string rozpoczyna się od "J" i kończy na "U"?
        System.out.println(Pattern.matches("J.*U", "JU"));
        //Czy string rozpoczyna się od wielkiej litery?
        System.out.println(Pattern.matches("[A-Z]+.*", "BBaAA"));
        //Czy string zawiera spację? (biały znak)?
        System.out.println(Pattern.matches(".*\\s+.*", "Ba AA"));
        //Czy string jest numerem telefonu zaczynającym się od 7 lub 8 lub 9?
        System.out.println(Pattern.matches("[7-9]\\d{2}[\\ -]?\\d{3}[\\ -]?\\d{3}", "723122111"));
        //Czy string jest numerem bankowym? (Zakładając, że zaczyna się od dwóch liter, następnie 4 grupy po 4 cyfry)
        System.out.println(Pattern.matches("[A-Z]{2}\\d{4}\\d{4}\\d{4}\\d{4}", "PL2222111133331111"));
        System.out.println(Pattern.matches("[A-Z]{2}[\\ ]?(\\d{4}[\\ ]?){4}", "PL 2222 1111 3333 1111"));
        //Czy string jest kodem pocztowym?
        System.out.println(Pattern.matches("[0-9]{2}[\\ -]?[0-9]{3}", "01-000"));
        System.out.println(Pattern.matches("\\d{2}[\\ -]?\\d{3}", "01-000"));
    }
}
