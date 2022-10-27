package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        System.out.println("Hello! My name is ZONG.\nI was created in 2022.\nPlease, remind me your name.");
        Scanner name = new Scanner(System.in);
        System.out.printf("What a great name you have, %s!\n", name.nextLine());
        System.out.println("Let me guess your age.\nEnter remainders of dividing your age by 3, 5 and 7.");
        Scanner three = new Scanner(System.in);
        Scanner fifth = new Scanner(System.in);
        Scanner seven = new Scanner(System.in);
        byte age = (byte) ((three.nextByte() * 70 + fifth.nextByte() * 21 + seven.nextByte() * 15) % 105);
        System.out.printf("Your age is %d;\nthat's a good time to start programming!", age);

    }
}
