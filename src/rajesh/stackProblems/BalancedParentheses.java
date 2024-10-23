package src.rajesh.stackProblems;


import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static boolean balancedParentheses(String input){
        Stack stack = new Stack();
        char[] charArray = input.toCharArray();
        for(int i = 0;i<charArray.length;i++){
            char current = charArray[i];
            if(current == '[' || current == '{' || current == '('){
                stack.push(current);
                continue;
            }
            if(stack.isEmpty())
                return false;
            if(current == ']' || current == '}' || current == ')'){
                char popchar = (char)stack.pop();
                switch (current){
                    case ']':
                        if(popchar != '[')
                            return false;
                        break;
                    case '}':
                        if(popchar != '{')
                            return false;
                        break;
                    case ')':
                        if(popchar != '(')
                            return false;
                        break;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "(()()(){}{})[]";
        if(balancedParentheses(input))
            System.out.println("String "+input+" is balanced Parenthesis");
        else
            System.out.println("String "+input+" is not balanced Parenthesis");
    }
}
