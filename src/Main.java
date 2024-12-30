import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\t- - - PROGRAM STARTED - - -");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter something: ");
        String userInput = input.next();

        System.out.println("Hello, the input is: " + userInput);

        input.close();
    }

}
