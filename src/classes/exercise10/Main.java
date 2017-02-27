package classes.exercise10;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Stwórz klasę Punkt2D, która przechowuje informacje na temat punktu na przestrzeni
        dwuwymiarowej (współrzędne x oraz y). Zawierająca dwa konstruktory: bezparametrowy
        ustawiający pola na wartość 0, oraz przyjmujący dwa argumenty i ustawiający pola obiektu
        zgodnie z podanymi parametrami.
        Napisz klasę Punkt3D dziedziczącą po Punkt2D reprezentującą punkt w trójwymiarze
        (dodatkowe pole z). W klasie testowej utwórz obiekty obu klas i przetestuj działanie.*/


public class Main {
    public static void main(String[] args) {
        Point2D point2D1 = new Point2D(2, 2);
        Point2D point2D2 = new Point2D();
        Point3D point3D1 = new Point3D(2, 2, 2);
        Point3D point3D2 = new Point3D();

        System.out.println(point2D1.toString());
        System.out.println(point2D2.toString());
        System.out.println(point3D1.toString());
        System.out.println(point3D2.toString());
    }
}
