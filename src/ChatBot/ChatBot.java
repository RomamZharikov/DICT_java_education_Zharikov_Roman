package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("\nHello! My name is ZONG.\nI was created in 2022.\nPlease, remind me your name.");
        Scanner name = new Scanner(System.in);
        System.out.printf("What a great name you have, %s!\n", name.nextLine());
        System.out.println("\nLet me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");
        Scanner three = new Scanner(System.in);
        Scanner fifth = new Scanner(System.in);
        Scanner seven = new Scanner(System.in);
        byte age = (byte) ((three.nextByte() * 70 + fifth.nextByte() * 21 + seven.nextByte() * 15) % 105);
        System.out.printf("Your age is %d;\nthat's a good time to start programming!\n", age);
        System.out.println("\nEnter any positive number, I will count from zero to it:");
        Scanner number = new Scanner(System.in);
        int number_int = number.nextInt();
        int i = 0;
        while (i <= number_int) {
            System.out.println(i + "!");
            i++;
        }
        System.out.println("\nLet`s have a quiz.");
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
