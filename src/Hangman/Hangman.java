package Hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args){
        String[] list = {
                "java", "python", "php", "ruby"
        };
        String result = list[(int) (Math.random() * list.length)];
        System.out.print("HANGMAN\nGuess the word: ");
        Scanner answer = new Scanner(System.in);
        if (answer.nextLine().equals(result))
            System.out.println("You survived!");
        else
            System.out.println("You lost!");
    }
}
