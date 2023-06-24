
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numOfNums = 0;
        double sum = 0;
        
        while(true) {
            System.out.println("Give a number:");
            double input = Double.valueOf(scanner.nextLine());
            
            if(input == 0) {
                break;
            }
            
            numOfNums = numOfNums + 1;
            sum = sum + input;
            
        }
        
        System.out.println("Average of the numbers: " + sum/numOfNums);

    }
}
