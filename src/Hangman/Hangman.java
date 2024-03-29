package Hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hangman {
    private final Scanner input = new Scanner(System.in);
    private final String[] list = {
            "java", "python", "kotlin", "javascript"
    };
    private int life;
    private char[] result_array;
    private char[] result_char;
    private final List<Character> used = new ArrayList<>();

    public void menu(){
        System.out.println("HANGMAN\n");
        while (true) {
            initialization();
            System.out.println("Type \"play\" to play the game, \"exit\" to quit:");
            String choice = input.nextLine();
            if (choice.equals("play")) {
                while (life > 0) {
                    System.out.printf("\nYou life: %d\nGuess the word %s: ", life, String.valueOf(result_char));
                    char char_answer = input.nextLine().toCharArray()[0];
                    if (97 <= Character.hashCode(char_answer) & Character.hashCode(char_answer) <= 122) {
                        life = check_was_used(char_answer);
                    } else
                        System.out.println("Please enter a lowercase English letter");
                }
                if (life == 0)
                    System.out.println("You lose!!!");
            } else if (choice.equals("exit"))
                break;
            else {
                System.out.println("Incorrect input");
            }
        }
    }
    private char[] checkout(char[] result, char[] result_char, char answer){
        byte changed = 0;
        for (int i = 0; i < result_char.length; i++) {
            if (answer == result[i]) {
                result_char[i] = answer;
                changed++;
            }
        }
        if (changed != 0)
            return result_char;
        else
            return null;
    }
    private int check_was_used(char char_answer) {
        if (used.isEmpty() | !used.contains(char_answer)) {
            used.add(char_answer);
            char[] new_result_char = checkout(result_array, result_char.clone(), char_answer);
            if (new_result_char == null) {
                life--;
                System.out.println("That letter doesn't appear in the word");
            } else if (Arrays.equals(new_result_char, result_array)) {
                System.out.println("You win!!!");
                return -1;
            } else if (!(boolean) Arrays.equals(new_result_char, result_char))
                result_char = new_result_char.clone();
        } else if (used.contains(char_answer)) {
            System.out.println("You`ve already guessed this letter");
        }
        return life;
    }
    private void initialization(){
        used.clear();
        life = 8;
        String result = list.clone()[(int) (Math.random() * list.length)];
        result_array = result.toCharArray();
        result_char = new char[result_array.length];
        for (int i = 0; i < result_array.length; i++)
            result_char[i] = '-';
    }
}
