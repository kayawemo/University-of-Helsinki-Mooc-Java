
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multipliply = num1 * num2;
       double division = Double.valueOf(num1) / Double.valueOf(num2);
        
        System.out.println(num1 + " + " + num2 + " = " + addition);
        System.out.println(num1 + " - " + num2 + " = " + subtraction);
        System.out.println(num1 + " * " + num2 + " = " + multipliply);
        System.out.println(num1 + " / " + num2 + " = " + division);

    }
}
