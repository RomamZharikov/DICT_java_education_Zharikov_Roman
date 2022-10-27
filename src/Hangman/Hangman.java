package Hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args){
        System.out.print("HANGMAN\nGuess the word: ");
        Scanner answer = new Scanner(System.in);
        if (answer.nextLine().equals("java"))
            System.out.println("You survived!");
        else
            System.out.println("You lost!");
    }
}
