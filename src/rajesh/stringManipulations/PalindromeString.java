package src.rajesh.stringManipulations;

import java.util.Scanner;

public class PalindromeString {

    public static boolean isPalindrome(String str){
        boolean isPalindrome = true;
        int left = 0;
        int right = str.length()-1;
        for(int i =0; left <= right; i++){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return isPalindrome;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        System.out.println("Is String Palindrome : "+isPalindrome(scanner.nextLine()));
    }
}
