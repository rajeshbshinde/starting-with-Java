package src.com.rajesh;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Role Number: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);

        System.out.print("Please enter your Name: ");
        String name = input.next();
        System.out.println(name);

        System.out.print("Please enter Marks: ");
        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
