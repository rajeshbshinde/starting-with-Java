package src.rajesh.stringManipulations;

public class ReversePrefixWord {

    public static String reversePrefix(String word, char ch){
        int end = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                end = i;
                break;
            }
        }
        if(end==0){
            return word;
        }
        StringBuilder sb = new StringBuilder();
        int newstart = end+1;
        while(end>=0){
            sb.append(word.charAt(end--));
        }
        while(newstart<word.length()){
            sb.append(word.charAt(newstart++));
        }
        return sb.toString();
    }
    public static void main(String [] args){
        System.out.println("Original String - xyxzxe, Reversed string - "+reversePrefix("xyxzxe",'z'));
        System.out.println("Original String - abcd, Reversed string -  "+reversePrefix("abcd",'z'));
        System.out.println("Original String - abcdefd, Reversed string - "+reversePrefix("abcdefd",'d'));
    }
}
