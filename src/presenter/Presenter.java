package presenter;

import model.Employees;
import view.View;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
public class Presenter {

    /**
     * @author
     */
    public Presenter() {
        model = new Employees();
        view = new View();

    }

    private Employees model;
    private View view;
    Scanner scanner = new Scanner(System.in);

    /*public void run() {
        int option = 0;
        while (option != 3) {
            option = showMenu();
            switch (option) {
                case 1:
                    add();
                    break;
            }
        }
    }*/

    public int showMenu() {
        int option = view.readInt("MENU PRINCIPAL \n1 empleados que entran \n2 horas trabajadas\n3 salir \n\nDigite opcion");
        return option;
    }

    /**
     * @author: sebastiancanoncastellanos
     */
    public void currentEmployees() {
        ArrayList<String> employeesArray = new ArrayList();

        int numberOfEmployees = view.readInt("Ingrese el numero de empleados que entraron a turno");
        int i = 1;
        while (i <= numberOfEmployees) {
            employeesArray.add(view.readString("Ingrese el nombre del empleado"));
            i++;
        }
        model.setWorkers(employeesArray);



    }

    /*public void currentPayroll(){
        ArrayList<Integer> currentHoursWorked = new ArrayList<Integer>();
        System.out.println("Para el horario, trabajaron " + model.getWorkers().size() + " empleados \nPor favor ingrese las horas trabajadas de cada empleado a continuacion");

        int i = 0;
        while (i <= model.getWorkers().size() - 1){
            currentHoursWorked.add(view.readInt(model.getWorkers().get(i)));
            i++;
        }
    } */

    public void currentPayroll(){
        int i = 1;
        while (i <= model.getWorkers().size()){
            int currentHoursWorked = view.readInt("Ingrese el numero de horas trabjadas");

            i++;
        }
    }

    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        presenter.currentEmployees();
        presenter.currentPayroll();
    }
}