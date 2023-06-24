
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        int total = 0;
        int i = firstNumber;
        
        while(i <= lastNumber) {
            total += i;
            i++;
        }
        
        System.out.println("The sum is " + total);

    }
}
