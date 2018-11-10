package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counting {
    public static void main(String [] args){
        Map<Character, Integer> letters = new HashMap<>();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type Something:");
        String strInput = userInput.nextLine();
        char[] charInput = strInput.toCharArray();
        int count = 0;
        for(char i : charInput){
            letters.merge(i, 1, Integer::sum);
            /*
            if the key has no value, it uses the value that you put in the merge function
            once the key has a value, it uses the value and sums it with value in the merge function and
            the value the actual key has as well

            it only sums because we gave it the Integer::sum function
             */

        }
        System.out.println(letters);
    }
}
