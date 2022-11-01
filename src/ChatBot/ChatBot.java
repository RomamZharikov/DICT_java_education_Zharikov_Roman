package ChatBot;

import java.util.Scanner;

public class ChatBot {
    private static final Scanner input = new Scanner(System.in);
    private final String name;
    public ChatBot(String name){
        this.name = name;
    }
    public void chat_bot_main(){
        System.out.printf("\nHello! My name is %s.\nI was created in 2022.\nPlease, remind me your name.\n", name);
        System.out.printf("What a great name you have, %s!\n", input.nextLine());
        System.out.println("\nLet me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");
        System.out.printf("Your age is %d;\nthat's a good time to start programming!\n", guess_age(input.nextByte(), input.nextByte(), input.nextByte()));
        System.out.println("\nEnter any positive number, I will count from zero to it:");
        count_to_zero(input.nextInt());
        System.out.println("\nLet`s have a quiz.");
        guess();
    }
    private byte guess_age(byte three, byte fifth, byte six){
        return (byte) ((three * 70 + fifth * 21 + six * 15) % 105);
    }
    private void count_to_zero(int number_int){
        for (int i = 0; i <= number_int; i++)
            System.out.println(i + "!");
    }
    private void guess(){
        while (true){
            System.out.println("""
                    What language am I(ChatBot) created?
                    1. Python
                    2. JavaScript
                    3. Java
                    4. Ruby""");
            Scanner answer = new Scanner(System.in);
            if (answer.nextInt() == 3) {
                System.out.println("Great, your right!\nGoodbye, have a nice day!");
                break;
            }
            else
                System.out.println("Please, try again!");
        }
    }
}

