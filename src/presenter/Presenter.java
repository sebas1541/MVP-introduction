package presenter;

import model.Employees;
import view.View;
import java.util.ArrayList;
import java.util.Scanner;

public class Presenter {
    public Presenter() {
        model = new Employees();
        view = new View();
    }

    private Employees model;
    private View view;
    Scanner scanner = new Scanner(System.in);

    public void run() {
        int option = 0;
        while (option != 4) {
            option = showMenu();
            switch (option) {
                case 1:
                    currentEmployees();
                    break;
                case 2:
                    currentPayroll();
                    break;
                case 3:
                    finalPayroll();
                    break;
            }
        }
    }
    public int showMenu() {
        int option = view.readInt("Menú principal \n1. Ingresar empleados \n2. Ingresar horas trabajadas \n3. Final nómina del día \n4 salir \n\nDigite opcion");
        return option;
    }

    public void currentEmployees() {

        model.setWagePerHour(view.readInt("Ingrese el valor de la hora en pesos"));
        ArrayList<String> employeesArray = new ArrayList();
        int numberOfEmployees = view.readInt("Ingrese el numero de empleados que entraron a turno");
        int i = 1;
        while (i <= numberOfEmployees) {
            employeesArray.add(view.readString("Ingrese el nombre del empleado número " + i));
            i++;
        }
        model.setWorkers(employeesArray);
    }


    public void currentPayroll() {
        ArrayList<Integer> currentHoursWorked = new ArrayList<Integer>();
        System.out.println("Para el horario, trabajaron " + model.getWorkers().size() + " empleados \nPor favor ingrese las horas trabajadas de cada empleado a continuacion");
        int i = 0;
        while (i <= model.getWorkers().size() - 1) {
            currentHoursWorked.add(view.readInt(model.getWorkers().get(i)));
            i++;
        }
        model.setHoursWorked(currentHoursWorked);
    }

    public void finalPayroll() {
        System.out.println("El sueldo total fue de " + model.payment());
    }

    public static void main(String[] args) {
        Presenter presenter = new Presenter();
        presenter.run();
    }
}