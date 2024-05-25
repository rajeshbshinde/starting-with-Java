package src.rajesh.stringManipulations;

import java.util.Scanner;

public class largestPalindrome {

    public static String largestPalindrome(String S) {
        // Count the frequency of each digit
        int[] digitCounts = new int[10]; // Array to store digit frequencies (0-9)
        for (char digit : S.toCharArray()) {
            digitCounts[digit - '0']++;
        }

        // Build the palindromic number
        StringBuilder sb = new StringBuilder();

        // Handle middle digit (if any)
        int middleDigit = -1;
        for (int i = 9; i > 0; i--) {
            if (digitCounts[i] % 2 == 1) {
                middleDigit = i;
                digitCounts[i]--; // Decrement count for middle digit
                break;
            }
        }

        // Add the most frequent digits for the first half
        for (int i = 9; i >= 0; i--) {
            if (digitCounts[i] >= 2) {
                int count = Math.min(digitCounts[i] / 2, sb.length()); // Add half for palindrome
                for (int j = 0; j <= count && digitCounts[i] >= 2; j++) {
                    sb.append(i);
                    digitCounts[i]-=2;
                }
                //digitCounts[i] -= (count * 2); // Decrement count for both halves
            }
        }



        // Handle leading zero (if all digits are even)
        if (sb.length() == 0) {
            return "0";
        }

        // Add the middle digit (if any)
        if (middleDigit != -1) {
            return sb.toString() +middleDigit+ sb.reverse().toString();
        }

        // Reverse the second half to create the palindrome
        return sb.toString() + sb.reverse().toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        String str = scanner.nextLine();
        System.out.println("Lorgest Palindrome is : "+largestPalindrome(str));
    }
}
