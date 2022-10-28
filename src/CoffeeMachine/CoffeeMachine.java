package CoffeeMachine;

public class CoffeeMachine {
    private final int cups_needed;
    private final int water;
    private final int milk;
    private final int coffee_beans;


    public CoffeeMachine(int cups_needed, int water, int milk, int coffee_beans){
        this.cups_needed = cups_needed;
        this.milk = milk;
        this.coffee_beans = coffee_beans;
        this.water = water;
    }
    public void output_coffee(){

        System.out.printf("""
                For %d cups coffee you need:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                """, cups_needed, cups_needed * 200, cups_needed * 50, cups_needed * 15);
    }
    public void can_i_make_coffee(){
        int made_coffee = (int) Math.floor(Math.min(water/200, Math.min(milk / 50, coffee_beans / 15)));
        if (made_coffee > cups_needed)
            System.out.printf("Yes, I can make %d amount coffee (and even %d more than that)\n", cups_needed, made_coffee - cups_needed);
        else if (made_coffee == cups_needed)
            System.out.printf("Yes, I can make %d amount of coffee\n", cups_needed);
        else System.out.printf("No, I can make only %d cups of coffee", made_coffee);
    }
}
