import java.util.Scanner;
import java.util.Random;

public class Blackjack {

    // Main class that runs when the code is executed
    public static void main(String[] args) {

        System.out.println("Welcome to blackjack - let's play!");

        Random random = new Random();
        boolean play = true;
        int high_score = -1;

        while (play) {

            int first_num = random.nextInt(99) + 1;
            int second_num = random.nextInt(99) + 1;
            int result = play(first_num, second_num);

            System.out.println("\nYour first number is: " + first_num);
            System.out.println("Your second number is: " + second_num + "\n");
            if (result == 21) {
                System.out.println("CONGRATS! You got 21.");
            } else if (result != 0) {
                System.out.println("Your score for this round is " + result);
            } else {
                System.out.println("You went bust! Your score for this round is 0.");
            }

            if (result > high_score) {
                high_score = result;
                System.out.println("\n\tNEW HIGH SCORE: " + result);
            }

            System.out.println("\nDo you want to continue to play? (Y/N)");

            if (!continuePlaying()) {
                System.out.println("\nThank you for playing.");
                play = false;
            }

        }

    }

    private static int play(int first_num, int second_num){
        if (first_num > 21 && second_num > 21) {
            return 0;
        } else if (first_num > 21) {
            return second_num;
        } else if (second_num > 21) {
            return first_num;
        } else return Math.max(first_num, second_num);

    }

    private static boolean continuePlaying() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.strip().equalsIgnoreCase("Y")) {
                return true;
            } else if (input.strip().equalsIgnoreCase("N")) {
                return false;
            } else {
                System.out.println("INVALID ANSWER. PLEASE CONFIRM WITH: Y/N");
            }
        }

    }
}
