package model;

import java.util.ArrayList;

/**
 * @author sebastiancanoncastellanos
 * @version 1.0
 */
public class Employees {

    int wagePerHour;
    ArrayList<String> workers = new ArrayList<String>();
    ArrayList<Integer> hoursWorked = new ArrayList<Integer>();

    public ArrayList<Integer> getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(ArrayList<Integer> hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //constructors

    public int getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(int wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public ArrayList<String> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<String> workers) {
        this.workers = workers;
    }

    public int payment() {
        int sum = 0;
        for (int i = 0; i < getHoursWorked().size(); i++) {
            sum += getHoursWorked().get(i);
        }
        int finalWage = sum * getWagePerHour();
        return (finalWage);
    }

}