package view;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private Scanner console;

    public View() {
        console = new Scanner(System.in);
    }

    public int readInt(String message) {
        System.out.println(message);
        int number = Integer.parseInt(console.nextLine());
        return number;
    }

    public String readString(String message) {
        System.out.println(message);
        String name = console.nextLine();
        return name;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

