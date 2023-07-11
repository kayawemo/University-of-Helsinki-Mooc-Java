
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        while(true) {
            String input = scanner.nextLine();

            if(input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            ages.add(Integer.valueOf(parts[1]));

        }
        int oldest = ages.get(0);
        for(Integer age : ages) {
            if (oldest < age) {
                oldest = age;
            }
        }
        System.out.println("Age of the oldest: " + oldest);




    }
}
