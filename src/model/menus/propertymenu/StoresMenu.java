package model.menus.propertymenu;

import model.exceptions.InvalidInputException;

import java.util.Scanner;

import static model.utils.Utils.getValidatedOption;

public class StoresMenu {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        int option = -1;
        do {
            printMenu(); /// Imprime un menú modularizado

            try {
                option = getValidatedOption(); /// Excepción que valida que sea un número

                switch (option) {
                    case 1:
                        System.out.println("Adding a store...");
                        break;
                    case 2:
                        System.out.println("Modifying a store...");
                        break;
                    case 3:
                        System.out.println("Cancelling a store...");
                        break;
                    case 4:
                        System.out.println("Viewing all stores...");
                        break;
                    case 0:
                        System.out.println("Returning to the previous menu...");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
                System.out.println("Press Enter to try again...");
                scanner.nextLine();
            }
        } while (option != 0);
    }

    private void printMenu() {
        System.out.println("┌───────────────────────────────┐");
        System.out.println("│          STORES MENU          │");
        System.out.println("├───────────────────────────────┤");
        System.out.println("│ 1. ADD STORE                  │");
        System.out.println("│ 2. MODIFY STORE               │");
        System.out.println("│ 3. CANCEL STORE               │");
        System.out.println("│ 4. VIEW STORES                │");
        System.out.println("│ 0. GO BACK                    │");
        System.out.println("└───────────────────────────────┘");
        System.out.print("Choose an option: ");
    }

}
