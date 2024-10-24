import java.util.Scanner;
import java.util.Random;

public class Blackjack {

    // Main class that runs when the code is executed
    public static void main(String[] args) {

        // Welcome the player
        System.out.println("Welcome to blackjack - let's play!");

        // Set variables that will be used throughout the game
        Random random = new Random(); // Random to generate the values
        boolean play = true; // boolean to state whether the user is still playing
        int high_score = -1; // int tracker to follow the current player's high score

        // Loop to play the game until the user is done
        while (play) {

            // Get the two values that the user has been given
            int first_num = random.nextInt(99) + 1;
            int second_num = random.nextInt(99) + 1;

            // Inform the user of the numbers that they got
            System.out.println("\nYour first number is: " + first_num);
            System.out.println("Your second number is: " + second_num + "\n");

            // Calculate the result of the game
            int result = play(first_num, second_num);

            // Depending on the result, show the corresponding output
            if (result == 21) {
                System.out.println("CONGRATS! You got 21.");
            } else if (result != 0) {
                System.out.println("Your score for this round is " + result);
            } else {
                System.out.println("You went bust! Your score for this round is 0.");
            }

            // Check whether their current score is higher than the current high score
            if (result > high_score) {
                // Update the high score
                high_score = result;
                System.out.println("\n\tNEW HIGH SCORE: " + result);
            }

            // Ask the user if they want to continue playing
            System.out.println("\nDo you want to continue to play? (Y/N)");

            // If the user does not want to continue, end the program
            if (!continuePlaying()) {
                System.out.println("\nThank you for playing.");
                play = false;
            }

        }

    }

    // Function to calculate the result of the game
    private static int play(int first_num, int second_num){
        if (first_num > 21 && second_num > 21) { // If both numbers are over 21, then they are bust
            return 0;
        } else if (first_num > 21) { // If the first number is over 21, then the second number is accepted
            return second_num;
        } else if (second_num > 21) { // If the second number is over 21, then the first number is accepted
            return first_num;
        } else return Math.max(first_num, second_num); // Else return the larger number of the two
        // (if they're the same it will return one of the two)

    }

    // Function to check whether the user is still playing
    private static boolean continuePlaying() {
        Scanner scanner = new Scanner(System.in);
        // Continue to get inputs until a valid one has been accepted
        while (true) {
            // Get the user's input
            String input = scanner.nextLine();
            if (input.strip().equalsIgnoreCase("Y")) { // User has confirmed they want to keep playing
                return true;
            } else if (input.strip().equalsIgnoreCase("N")) { // User doesn't want to keep playing
                return false;
            } else {
                System.out.println("INVALID ANSWER. PLEASE CONFIRM WITH: Y/N");
            }
        }

    }
}
