
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String longestName = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] details = input.split(",");
            String name = details[0];
            int year = Integer.valueOf(details[1]);
            sum = sum + year;
            count++;

            if (name.length() > longestName.length()) {
                longestName = name;
            }


        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of teh birth years: " + 1.0 * sum / count);

    }
}
