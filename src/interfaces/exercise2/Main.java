package interfaces.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Dorota Marszałek on 2017-02-28.
 */

/*Zdefiniuj klasę Person, oraz klasę dziedziczącą Employee, zaimplementuj interfejs
        Comparable I skorzystaj z metody Sort w Collection.*/


public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Adam", "Kowalski", 2000.11));
        employees.add(new Employee("Zdzisław", "Nowak", 1500.00));
        employees.add(new Employee("Anna", "Kowalczuk", 8000.21));
        employees.add(new Employee("Justyna", "Marczak", 3500.11));

        // Pierwszy sposób
        Collections.sort(employees);
        System.out.println("Posortowane elementy:");
        System.out.println(employees);
        System.out.println();

        //Drugi sposób
        for(Employee e:employees){
            System.out.println(e);
        }
        System.out.println();

        // Trzeci sposób
        for (int i=0; i<employees.size(); i++){
            System.out.println(employees.get(i));
        }
    }
}
