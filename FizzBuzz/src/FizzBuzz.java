import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        // Greet the user
        System.out.println("WELCOME TO FIZZ BUZZ");
        System.out.println("\nPlease input a maximum value:");

        // Get the user's input
        Scanner scanner = new Scanner(System.in);

        // Ensure that the user's input is a positive value and not equal to zero
        int maxValue = -1;
        while (maxValue < 1) {
            maxValue = checkInteger(scanner);
            if (maxValue < 0) {
                System.out.println("INPUTTED VALUE IS TOO SMALL. PLEASE INPUT ANOTHER NUMBER.");
            }
        }

        System.out.println(""); // For aesthetic reasons

        // Once value has been found, print out all of the values
        for (int x = 1; x < maxValue + 1; x++){
            System.out.println(printData(x));
        }

        // End
    }

    // Function to check whether the inputted value is an integer
    private static int checkInteger(Scanner scanner) {
        // Continue to get inputs until a valid one has been accepted
        while (true) {
            // Get the user's input
            String input = scanner.nextLine();
            // If it is an integer, the try loop will succeed
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("INVALID INTEGER. TRY AGAIN");
            }
        }
    }

    // Function to print the correct data depending on
    private static String printData(int currentValue) {
        // Depending on the value type, return the correct value to print
        if (currentValue % 3 == 0 && currentValue % 5 == 0) {
            return "FizzBuzz";
        } else if (currentValue % 3 == 0) {
            return "Fizz";
        } else if (currentValue % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(currentValue);
        }
    }

}