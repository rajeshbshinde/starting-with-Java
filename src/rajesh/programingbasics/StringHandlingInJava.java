package src.rajesh.programingbasics;

import java.util.Scanner;

public class StringHandlingInJava {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        // Creating string object
        String s1 = scanner.nextLine();
        // Char at index 2
        System.out.println("Character at index 2 in the string is:'"+s1.charAt(2)+"'");
        String s2 = "abcd";
        System.out.println("Comparing String s1 & s2 is :"+s1.compareTo(s2));// Compare String return 0 if equal
        System.out.println("Concatinated string for s1 and s2 is:"+s1.concat(s2)); // as good as s1+s2 or combine string
        System.out.println("Is s1 contains s2 : "+s1.contains("abcd")); // Contains returns true or false
    }
}
