package src.rajesh.stringManipulations;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BoldSubSubstring {
    public static String boldKeywords(String s, List<String> keywords){
        StringBuilder result = new StringBuilder();
        char s1[] = s.toCharArray();
        int i = 0;
        
        for(String keyword:keywords){
            int index = s.indexOf(keyword,i);
            while(index != -1) {
                for (int j = 0; j <keyword.length();j++){
                    s1[j+index] = '0';
                }
//                i = index + keyword.length();
                index = s.indexOf(keyword,i+keyword.length());
            }
        }

//        for(String keyword:keywords){
//            int index = s.indexOf(keyword,i);
//            while(index!=-1){
//                result.append(s.substring(i,index)).append("<b>").append(keyword).append("</b>");
//                i = index + keyword.length();
//                index = s.indexOf(keyword, i);
//            }
//
//
//        }
        result.append(s.substring(i));
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "aaabbccaaa";
        List<String> keywords = new ArrayList<>();
        keywords.add("aaa");
        keywords.add("aab");
        keywords.add("bc");
        String result = boldKeywords(s, keywords);
        System.out.println(result); // Output: "<b>aaabbc</b>c<b>aaa</b>"
    }

}
