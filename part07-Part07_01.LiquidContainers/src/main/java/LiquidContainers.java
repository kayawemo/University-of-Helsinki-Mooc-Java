
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        ArrayList<Integer> sum = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int total = 100;

        while (true) {
            System.out.println("First: " + first + "/" + total);
            System.out.println("Second: " + second + "/" + total);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
            }

            if (command.equals("move") && amount > 0) {
                if (first > 0) {
                    if (first - amount < 0){
                        second = first;
                        first = 0;
                    }else {
                        first -= amount;
                        second += amount;
                    }
                }
                
                if(second > 100){
                    second = 100;
                }
            }

            if (command.equals("remove") && amount > 0) {
                if(second > amount){
                    second -= amount;
                }else if (second <= amount){
                    second = 0;
                }
                

            }

        }
    }

}
