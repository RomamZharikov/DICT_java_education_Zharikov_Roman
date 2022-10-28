package CoffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        CoffeeMachine coffee = new CoffeeMachine();
        coffee.out_values();
        System.out.println("\nWrite action (buy, fill, take):");
        String choice = input.nextLine();
        switch (choice){
            case "buy" -> coffee.buy_menu();
            case "fill" -> coffee.fill();
            case  "take" -> coffee.take();
        }
        coffee.out_values();

    }
}
