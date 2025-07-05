import java.util.InputMismatchException;
import java.util.Scanner;

public class Question6_a {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int userInput = 0;

        while (true) {
            try {
                System.out.print("Enter a positive integer: ");
                userInput = inputScanner.nextInt();

                if (userInput <= 0) {
                    throw new IllegalArgumentException("Number must be positive.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                inputScanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        int divisorTotal = 0;
        for (int divisor = 1; divisor <= userInput / 2; divisor++) {
            if (userInput % divisor == 0) {
                divisorTotal += divisor;
            }
        }

        if (divisorTotal == userInput) {
            System.out.println(userInput + " is a perfect number.");
        } else {
            System.out.println(userInput + " is not a perfect number.");
        }

        inputScanner.close();
    }
}
