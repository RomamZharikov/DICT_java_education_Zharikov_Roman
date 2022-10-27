package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args){
        System.out.print("Hello! My name is ZONG.\nI was created in 2022.\nPlease, remind me your name.\n");
        Scanner a = new Scanner(System.in);
        System.out.print("What a great name you have, " + a.nextLine() + "!");
    }
}
