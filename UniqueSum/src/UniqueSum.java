import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniqueSum {

    public static void main(String[] args) {

        // Get the user to input 3 integer values
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = new ArrayList<>();
        do {
            intList.add(checkInteger(scanner));
        } while (intList.size() < 3);

        System.out.println("\nCALCULATING SUM OF THE NUMBERS");

        // Get the unique values within the list to sum
        List<Integer> uniqueList = intList.stream().distinct().toList();

        // Sum the unique values
        int sum = 0;
        for (Integer integer : uniqueList) {
            sum += integer;
        }
        // Display the sum of the unique values
        System.out.println("\nThe sum of the unique values is: " + sum);

    }

    private static int checkInteger(Scanner myObj){
        while (true) {
            System.out.println("Please input an integer");
            String input = myObj.nextLine();
            try {
                return Integer.parseInt(input);
            }
            catch (NumberFormatException e) {
                System.out.println("INVALID INTEGER");
            }
        }
    }

}
