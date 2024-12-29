package CodingProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dfgfd {

    public static void main(String[] args) {


        // Example input string
        String s = "geeksforgeeks";

        // Step 1: Get the size of the input string
        int n = s.length();

        // Step 2: Initialize a variable to store the first repeating character
        String firstRepeatingChar = "-1";

        // Step 3: Iterate through each character in the string
        for (int i = 0; i < n; i++) {
            char y=s.charAt(i);
            // Step 4: Check if the current character is a repeating character
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {

                    // Step 5: Assign the first repeating character and break
                    firstRepeatingChar = Character.toString(s.charAt(i));
                    break;
                }
            }

            // If a repeating character is found, break the outer loop
            if (!firstRepeatingChar.equals("-1")) {
                break;
            }
        }

        // Step 6: Print the result
        System.out.println(firstRepeatingChar);












    }
}
