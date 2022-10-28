package CoffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int have_water = input.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int have_milk = input.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int have_coffee_beans = input.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int need_coffee = input.nextInt();
        CoffeeMachine coffee = new CoffeeMachine(need_coffee, have_water, have_milk, have_coffee_beans);
        coffee.can_i_make_coffee();

    }
}
