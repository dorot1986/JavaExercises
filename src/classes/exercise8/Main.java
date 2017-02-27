package classes.exercise8;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Do klasy Employee zdefiniuj metodę statyczną zwracającą sumę wszystkich pensji
        pracowników.*/


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam", "Kowalski", 1986, 6, 3500);
        Employee employee2 = new Employee("Anna", "Nowak", 1988, 4, 2500);
        Employee employee3 = new Employee("Jan", "Kwiecień", 1984, 8, 4500);
        Employee employee4 = new Employee("Katarzyna", "Kowalczyk", 1986, 6, 3500);
        System.out.println("Suma pensji wszystkich pracowników to: " + Employee.getSumOfAllSallaries());
    }
}
