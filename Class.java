// Imported Scanner for testing
import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        // Your code goes here
        System.out.println("Hello, World!");
        System.out.println("Aloha! How are you doing today?");
        System.out.println("I am good, thanks for asking.");

        // This is just a different comment for testing
        Scanner input = new Scanner(System.in);
        System.out.print("Hello, enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello there, " + name + "I hope you are doing well today!");
        input.close();
    }
}
