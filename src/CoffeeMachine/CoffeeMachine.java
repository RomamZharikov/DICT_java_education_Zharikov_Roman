package CoffeeMachine;

public class CoffeeMachine {
    private final int cups_needed;

    public CoffeeMachine(int cups_needed){
        this.cups_needed = cups_needed;
    }
    public void output_coffee(){

        System.out.printf("""
                For %d cups coffee you need:
                %d ml of water
                %d ml of milk
                %d g of coffee beans
                """, cups_needed, cups_needed * 200, cups_needed * 50, cups_needed * 15);
    }
}
