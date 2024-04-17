package src.rajesh.stringManipulations;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring {
    public static String getLongestUniqueSubstring(String s){
        int len = s.length()-1;
        int maxLength = 0;
        int startIndex =0;
        int endIndex = 0;
        Set<Character> charSet = new HashSet<>();

        for(int i =0; i < len; i++){
            while(!charSet.contains(s.charAt(i)) && i < len){
                System.out.println("Char at index "+i+" is "+s.charAt(i));
                charSet.add(s.charAt(i));
                endIndex = i ;
                maxLength = Math.max(maxLength, endIndex - startIndex + 1);
                i++;
                System.out.println("Charset is "+charSet.toString());
                System.out.println("Start Index is "+startIndex+ "\nEnd index is "+endIndex);
                System.out.println("Max Length is "+maxLength);
            }
            charSet.remove(s.charAt(startIndex));
            startIndex++;
            System.out.println("Char at index "+i+" is "+s.charAt(i));
            System.out.println("Charset is "+charSet.toString());
            System.out.println("Start Index is "+startIndex+ "\nEnd index is "+endIndex);
            System.out.println("Max Length is "+maxLength);
        }
        System.out.println("Max Length is "+maxLength);
        return s.substring(startIndex,startIndex+maxLength);
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the string:");
        String str = scanner.nextLine();
        System.out.println("Substring is "+getLongestUniqueSubstring(str));
    }
}
