package classes.exercise2;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Stwórz klasę Samochód posiadającą następujące atrybuty:
        - brand,
        - model,
        - price.
        Stwórz metody dostępowe do atrybutów. Stwórz metodę show wyświetlającą markę oraz
        cenę w jednej linii.*/


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X3", 100000);
        Car car2 = new Car("BMW", "E30", 70000.00);
        Car car3 = new Car("Opel", "Corsa", 50000);

        car1.show();
        car2.show();
        car3.show();
    }

}
