package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffee_beans;
    private int cups;
    private int money;
    private final Scanner input = new Scanner(System.in);


    public CoffeeMachine(){
        this.milk = 540;
        this.coffee_beans = 120;
        this.water = 400;
        this.cups = 9;
        this.money = 550;
    }
    public void buy_menu(){
        byte try_choice = 0;
        while (try_choice == 0) {
            System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to exit in main menu");
            String choice = input.nextLine();
            switch (choice) {
                case "1" -> {espresso(); try_choice += 1;}
                case "2" -> {latte(); try_choice += 1;}
                case "3" -> {cappuccino(); try_choice += 1;}
                case "back" -> try_choice += 1;
                default -> System.out.println("Unknown variable: " + choice + "\nTry again!");
            }
        }
    }
    private void espresso(){
        System.out.println("\nHow many cups do you want?");
            coffee_preparation(Integer.parseInt(input.nextLine()), 250, 0, 16, 4, "espresso");
    }
    private void latte(){
        System.out.println("\nHow many cups do you want?");
        coffee_preparation(Integer.parseInt(input.nextLine()), 350, 75, 20, 7, "latte");
    }
        private void cappuccino(){
            System.out.println("\nHow many cups do you want?");
            coffee_preparation(Integer.parseInt(input.nextLine()), 200, 100, 12, 6, "cappuccino");
        }
        public void fill(){
            System.out.println("\nWrite how many ml of water you want to add:");
            water += Integer.parseInt(input.nextLine());
            System.out.println("Write how many ml of milk you want to add:");
            milk += Integer.parseInt(input.nextLine());
            System.out.println("Write how many grams of coffee beans you want to add:");
            coffee_beans += Integer.parseInt(input.nextLine());
            System.out.println("Write how many cups you want to add:");
            cups += Integer.parseInt(input.nextLine());
        }
        public void take(){
            money -= money;
        }
        public void out_values(){
            System.out.printf("""
                    \nThe coffee machine has:
                    %dml of water
                    %dml of milk
                    %dg of coffee beans
                    %d of disposable cups
                    %d uah of money
                    """, water, milk, coffee_beans, cups, money);
        }
        private void coffee_preparation(int cups_needed, int water_need, int milk_need, int coffee_beans_need, int money_take, String name){
            if (cups_needed * water_need <= water){
                if (cups_needed * coffee_beans_need <= coffee_beans){
                    if (cups_needed <= cups){
                        if (cups_needed * milk_need <= milk){
                            water -= cups_needed * water_need;
                            coffee_beans -= cups_needed * coffee_beans_need;
                            cups -= cups_needed;
                            milk -= milk_need * cups_needed;
                            money += money_take;
                            System.out.printf("Take you're %d %s.", cups_needed, name);
                        } else
                            System.out.println("Please, restock milk");
                    } else
                        System.out.println("Please, restock cups");
                } else
                    System.out.println("Please, restock coffee beans");
            } else
                System.out.println("Please, restock water");
        }
}
