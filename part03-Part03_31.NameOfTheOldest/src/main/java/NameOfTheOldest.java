
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            names.add(parts[0]);
            ages.add(Integer.valueOf(parts[1]));
        }

            String oldestName = names.get(0);
            int oldest = ages.get(0);
            for (int i = 0; i < names.size(); i++) {
                if (oldest < ages.get(i)) {
                    oldest = ages.get(i);
                    oldestName = names.get(i);
                }
            }
            System.out.println("Name of the oldest: " + oldestName);

    }
}
