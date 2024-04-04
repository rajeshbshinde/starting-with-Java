package src.com.rajesh;

public class Basics {
    public static void main(String[] args) {
        int a = 10;
        if (a == 10) {
            System.out.println("Hello World");
        }
        int count = 1;
        while(count != 5) {
            System.out.println("Inside while loop "+count);
            count++;
        }

        // for loop
        for(int count1 = 1; count1 != count; count1++) {
            System.out.println("Inside for loop"+count1);
        }
    }
}
