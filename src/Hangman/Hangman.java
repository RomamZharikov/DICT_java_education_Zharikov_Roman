package Hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args){
        String[] list = {
                "java", "python", "kotlin", "javascript"
        };
        String result = list[(int) (Math.random() * list.length)];
        char[] result_array = result.toCharArray();
        for (int i = 2; i < result_array.length; i++)
            result_array[i] = '-';
        System.out.printf("HANGMAN\nGuess the word %s: ", String.valueOf(result_array));
        Scanner answer = new Scanner(System.in);
        if (answer.nextLine().equals(result))
            System.out.println("You survived!");
        else
            System.out.println("You lost!");
    }
}
