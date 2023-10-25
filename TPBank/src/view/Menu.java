package view;

import controller.Login;;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    Login lg = new Login();

    private final Scanner in = new Scanner(System.in);

    private final String ACCOUNT_NUMBER_VALID = "^\\d{10}$";


    public void display() {
        Locale vietnamese = new Locale("vi");
        Locale english = Locale.ENGLISH;
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
        int choice = lg.checkInputIntLimit(1, 3, english);
        switch (choice) {
            case 1:
                lg.login(vietnamese);
                break;
            case 2:
                lg.login(english);
                break;
            case 3:
                return;
        }
    }
}