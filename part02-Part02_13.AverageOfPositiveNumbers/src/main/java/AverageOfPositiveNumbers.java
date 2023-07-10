
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int numOfNums = 0;
        int sum = 0;
        int positiveNums = 0;
        
        while(true) {

            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0){
                break;

            }else if(input > 0 ) {
                positiveNums = positiveNums + 1;
                numOfNums = numOfNums + 1;
                sum = sum + input;
            } else if (input < 0) {
                continue;
            }
        }

        if (positiveNums == 0) {
            System.out.println("Cannot calculate the average");
        }
        
        System.out.println( 1.0 * sum/numOfNums);
    }
}
