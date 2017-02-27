package classes.exercise5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Zdefinuj klasę Product posiadającą name,description, specification. Dodaj odpowiedni
        konstruktor. Zdefiniuj Klasę Guarantee, która odnosi się do danego produktu oraz dodatkowy
        atrybut validUntil.
        Zdefiniuj metodę publiczną isValid. Jeśli produkt jest ważny zwraca true w przeciwnym
        wypadku false.
        Funkcjonalność wzorowana na serwisie http://www.guaranteesbox.com/*/


public class Main {
    public static void main(String[] args) {
        Product phone = new Product("phone", "Samsung S3", "White");
        Product laptop = new Product("laptop", "Lattitude E650", "Black");
        Guarantee guarantee1 = new Guarantee(phone, LocalDate.of(2017, 7, 22));
        Guarantee guarantee2 = new Guarantee(phone, LocalDate.of(2016, 7, 22));
        Guarantee guarantee3 = new Guarantee(laptop, LocalDate.of(2018, 6, 1));
        Guarantee guarantee4 = new Guarantee(laptop, LocalDate.of(2016, 1, 20));

        System.out.println(guarantee1.guaranteeDescription());
        System.out.println(guarantee1.isValid());
        System.out.println(guarantee2.guaranteeDescription());
        System.out.println(guarantee2.isValid());
        System.out.println(guarantee3.guaranteeDescription());
        System.out.println(guarantee3.isValid());
        System.out.println(guarantee4.guaranteeDescription());
        System.out.println(guarantee4.isValid());
    }
}
