package src.rajesh.stringManipulations;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String s){
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = len-1; i >=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String str = scanner.nextLine();
        System.out.println("Reverse String is "+reverseString(str));
    }
}
