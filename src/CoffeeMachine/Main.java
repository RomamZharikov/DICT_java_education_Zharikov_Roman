package CoffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CoffeeMachine coffee = new CoffeeMachine();
        byte exit = 0;
        while (exit == 0) {
            System.out.println("\nWrite action (buy, fill, take, remaining or exit):");
            String choice = input.nextLine();
            switch (choice) {
                case "buy" -> coffee.buy_menu();
                case "fill" -> coffee.fill();
                case "take" -> coffee.take();
                case "remaining" -> coffee.out_values();
                case "exit" -> exit = 1;
                default -> System.out.println("Unknown variable: " + choice);
            }
        }
    }
}
