import java.util.*;

public class UniqueSum {

    public static void main(String[] args) {

        // Get the user to input 3 integer values
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = new ArrayList<>();
        do {
            intList.add(checkInteger(scanner));
        } while (intList.size() < 3);

        System.out.println("\nCALCULATING SUM OF THE NUMBERS");

        // Sum the unique values
        int sum = 0;
        for (Integer integer : intList) {
            // Ensure that the number only exists once in the list
            if (Collections.frequency(intList, integer) == 1) {
                sum += integer;
            }
        }
        // Display the sum of the unique values
        System.out.println("\nThe sum of the unique values is: " + sum);

    }

    // Function to insure that the input is a valid integer
    private static int checkInteger(Scanner myObj){
        while (true) {
            // Prompt the user to input an integer
            System.out.println("Please input an integer");
            String input = myObj.nextLine();
            // If the value is an integer, then the try loop will succeed
            try {
                return Integer.parseInt(input);
            }
            catch (NumberFormatException e) {
                System.out.println("INVALID INTEGER");
            }
        }
    }

}
