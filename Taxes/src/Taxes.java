import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {

        // Greet the user
        System.out.println("TAX CALCULATOR");
        System.out.println("\nPlease input your salary: (Format: XXXX.XX)");

        // Get the user's input
        Scanner scanner = new Scanner(System.in);

        // Ensure that the user's input is a positive value and not equal to zero
        float salary = -1;
        while (salary < 0) {
            salary = checkFloat(scanner);
            if (salary < 0) {
                System.out.println("YOU CAN'T HAVE A NEGATIVE SALARY. PLEASE INPUT A VALID SALARY.");
            }
        }

        System.out.println(); // For aesthetic reasons

        // Calculate the amount being taxed
        float taxAmount = 0;
        List<Float> taxBracketAmounts = new ArrayList<Float>();
        List<Float> taxBracketPercent = new ArrayList<Float>();
        Collections.addAll(taxBracketPercent, (float) 0.1, (float) 0.15, (float) 0.20, (float) 0.25);
        if (salary < 15000) {
            taxAmount = 0;
        } else if (salary < 20000) {
            taxBracketAmounts.add(salary - 14999);
        } else if (salary < 30000) {
            taxBracketAmounts.add((float) 5000);
            taxBracketAmounts.add(salary - 19999);
        } else if (salary < 45000) {
            taxBracketAmounts.add((float) 5000);
            taxBracketAmounts.add((float) 10000);
            taxBracketAmounts.add(salary - 29999);
        } else {
            taxBracketAmounts.add((float) 5000);
            taxBracketAmounts.add((float) 10000);
            taxBracketAmounts.add((float) 15000);
            taxBracketAmounts.add(salary - 44999);
        }

        for (int x = 0; x < taxBracketAmounts.size(); x++){
            taxAmount += taxBracketAmounts.get(x) * taxBracketPercent.get(x);
        }

        // Print out the salary and tax amount
        System.out.println("SALARY BEFORE TAX:\t£" + String.format("%.2f", salary));
        System.out.println("TAX AMOUNT:\t\t\t£" + String.format("%.2f", taxAmount));

        // End
    }

    // Function to check whether the inputted value is an integer
    private static float checkFloat(Scanner scanner) {
        // Continue to get inputs until a valid one has been accepted
        while (true) {
            // Get the user's input
            String input = scanner.nextLine();
            // Check whether it is a valid float, else repeat user input
            if (input.contains(".")) {
                // Input contains at least one decimal place, so ensure that it is valid
                if (input.split("\\.").length > 2) {
                    // Error - too many decimal points
                    System.out.println("INVALID VALUE. 1 DECIMAL POINT MAX. TRY AGAIN");
                } else if (input.split("\\.")[1].length() > 2) {
                    // Error - too many decimal places
                    System.out.println("INVALID VALUE. 2 DECIMAL PLACES MAX. TRY AGAIN");
                } else {
                    // If the input is a valid float, then it will be returned
                    try {
                        return Float.parseFloat(input);
                    } catch (NumberFormatException e) {
                        System.out.println("INVALID VALUE. TRY AGAIN");
                    }
                }
            } else {
                // If the input is a valid float, then it will be returned
                try {
                    return Float.parseFloat(input);
                } catch (NumberFormatException e) {
                    System.out.println("INVALID VALUE. TRY AGAIN");
                }
            }

        }
    }

}
