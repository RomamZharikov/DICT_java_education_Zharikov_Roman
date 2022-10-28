package CoffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Write how many cups of coffee you will need:");
        Scanner input = new Scanner(System.in);
        int need_coffee = input.nextInt();
        CoffeeMachine coffee = new CoffeeMachine(need_coffee);
        coffee.output_coffee();

    }
}
