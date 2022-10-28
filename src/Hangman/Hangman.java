package Hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN");
        List<Character> used = new ArrayList<>();
        byte life = 8;
        String[] list = {
                "java", "python", "kotlin", "javascript"
        };
        String result = list[(int) (Math.random() * list.length)];
        char[] result_array =  result.toCharArray();
        char[] result_char = new char[result_array.length];
        for (int i = 0; i < result_array.length; i++)
            result_char[i] = '-';
        Scanner input = new Scanner(System.in);
        while (life > 0) {
            System.out.printf("You life: %d\nGuess the word %s: ", life, String.valueOf(result_char));
            char char_answer = input.nextLine().toCharArray()[0];
            if (97 <= Character.hashCode(char_answer) & Character.hashCode(char_answer) <= 122) {
                if (used.isEmpty() | !used.contains(char_answer)) {
                    used.add(char_answer);
                    char[] new_result_char = checkout(result_array, result_char.clone(), char_answer);
                    if (new_result_char == null) {
                        life--;
                        System.out.println("That letter doesn't appear in the word");
                    } else if (Arrays.equals(new_result_char, result_array)) {
                        System.out.println("You win!!!");
                        break;
                    } else if (!(boolean) Arrays.equals(new_result_char, result_char))
                        result_char = new_result_char.clone();
                } else if (used.contains(char_answer))
                    System.out.println("You`ve already guessed this letter");
            }else
                System.out.println("Please enter a lowercase English letter");
        }
        if (life <= 0)
            System.out.println("You lose!!!");

    }
    public static char[] checkout(char[] result, char[] result_char, char answer){
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
}