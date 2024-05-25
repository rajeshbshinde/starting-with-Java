package src.rajesh.programingbasics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Primitives {
    public static void main(String[] args) {
        int rollno = 64;
        char letter = 'r';
        float marks = 98.67f;
        double largeDecimalNumbers = 4567654.4567;
        long largeInteger = 34567834567876543L;
        boolean check = false;
        Map<Integer,Character> m = new HashMap<>();
        Set<Character> charSet = new HashSet<>();


        m.put(1,'A');
        m.put(2,'B');

        System.out.println("Map after adding element is "+m);
        System.out.println("Element at index 2 is "+m.get(2));
        m.remove(2);

        System.out.println("Map after removing index 2 is "+m);

        charSet.add('A');
        charSet.add('B');
        System.out.println("Charset after adding element is "+charSet);
        charSet.add('A');
        System.out.println("Charset after adding duplicate element is "+charSet);
        charSet.remove('A');
        System.out.println("Charset after removing an  element is "+charSet);
        float c = 30.6f;
        c++;
        System.out.println(c);
        c = (int)(c) + 1;
        System.out.println(c);

    }
}
