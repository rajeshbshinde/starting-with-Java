package src.rajesh.stringManipulations;

import java.util.HashMap;
import java.util.Map;

public class ReplaceCharacterOccurrences {

    public static String replaceOccurrences(String str, char ch){
        Map<Character,Integer> charCount = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
            int count = charCount.get(c);
            if(c==ch){
                for(int i = 0;i<count;i++){
                    result.append("*");
                }
            }else{
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'l';
        String result = replaceOccurrences(str, ch);
        System.out.println(result); // Output: he***o wo***d
    }
}
