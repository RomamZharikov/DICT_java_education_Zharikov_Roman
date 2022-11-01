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
            if ("exit".equals(choice)) {
                exit = 1;
            } else {
                coffee.coffee_machine_menu(choice);
            }
        }
    }
}
