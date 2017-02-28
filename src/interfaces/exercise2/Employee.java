package interfaces.exercise2;

import java.lang.Comparable;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Employee extends Person implements Comparable<Employee>{
    private double sallary;

    public Employee(String name, String surname, double sallary) {
        super(name, surname);
        this.sallary = sallary;
    }

    public double getSallary() {
        return sallary;
    }

    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    @Override
    public String toString(){
        return this.getName() + " " + this.getSurname() + " " + sallary;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.sallary==o.sallary){
            return 0;
        }
        if (this.sallary>o.sallary){
            return 1;
        }
        else{
            return -1;
        }
    }
}
