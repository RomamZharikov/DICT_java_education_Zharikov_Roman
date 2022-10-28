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
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
        String choice = input.nextLine();
            switch (choice) {
                case "1" -> espresso();
                case "2" -> latte();
                case "3" -> cappuccino();
            }
        }
    private void espresso(){
        System.out.println("\nHow many cups do you want?");
        int cups_need = input.nextInt();
        if (cups_need * 250 <= water & cups_need * 16 <= coffee_beans & cups_need <= cups){
            water -= cups_need * 250;
            coffee_beans -= cups_need * 16;
            cups -= cups_need;
            money += 4;
            System.out.printf("Take you're %d espresso.", cups_need);
        }
        else
            System.out.println("Please, restock");
    }
    private void latte(){
        System.out.println("\nHow many cups do you want?");
        int cups_need = input.nextInt();
        if (cups_need * 350 <= water & cups_need * 20 <= coffee_beans & cups_need <= cups & cups_need * 75 <= milk){
            water -= cups_need * 350;
            coffee_beans -= cups_need * 20;
            cups -= cups_need;
            milk -= 75 * cups_need;
            money += 7;
            System.out.printf("Take you're %d latte.", cups_need);
        }
        else
            System.out.println("Please, restock");
        }
        private void cappuccino(){
            System.out.println("\nHow many cups do you want?");
            int cups_need = input.nextInt();
            if (cups_need * 200 <= water & cups_need * 12 <= coffee_beans & cups_need <= cups & cups_need * 100 <= milk){
                water -= cups_need * 200;
                coffee_beans -= cups_need * 12;
                cups -= cups_need;
                milk -= 100 * cups_need;
                money += 6;
                System.out.printf("Take you're %d cappuccino.", cups_need);
            }
            else
                System.out.println("Please, restock");
        }
        public void fill(){
            System.out.println("\nWrite how many ml of water you want to add:");
            water += input.nextInt();
            System.out.println("Write how many ml of milk you want to add:");
            milk += input.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add:");
            coffee_beans += input.nextInt();
            System.out.println("Write how many cups you want to add:");
            cups += input.nextInt();
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
                    %duah of money
                    """, water, milk, coffee_beans, cups, money);
        }
}
