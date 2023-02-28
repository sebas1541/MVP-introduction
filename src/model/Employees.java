package model;

import java.util.ArrayList;

/**
 * @author sebastiancanoncastellanos
 * @version 1.0
 *
 */
public class Employees {


    int hoursWorked;
    int morningWagePerHour = 9000;
    int afternoonWagePerHour = 10000;
    ArrayList<String> workers = new ArrayList();
    //constructors
    public int getHoursWorked() {
        return hoursWorked;
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public ArrayList<String> getWorkers() {
        return workers;
    }
    public void setWorkers(ArrayList<String> workers) {
        this.workers = workers;
    }

    /*public int morningPayment(int hoursWorked){

        return morningWagePerHour * getHoursWorked();
    }/*

    /*calcular el costo total de cada turno, mañana y tarde */

   /* public int totalAfternoonPayment(int hoursWorked) {
        int numberOfEmployees = getWorkers().size();
        return afternoonWagePerHour * getHoursWorked();
    }*/

    public int totalMorningPayment() {
        int numberOfEmployees = getWorkers().size();
        return numberOfEmployees * morningWagePerHour;
    }
}