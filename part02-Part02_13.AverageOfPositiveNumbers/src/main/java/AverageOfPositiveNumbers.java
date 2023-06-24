
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numOfNums = 0;
        double sum = 0;
        double positiveNums = 0;
        
        while(true) {
            System.out.println("Give a number:");
            double input = Double.valueOf(scanner.nextLine());
            
            if (input == 0){
                break;
            }
            
            
            if(input > 0) {
                
                positiveNums = positiveNums + 1;
                numOfNums = numOfNums + 1;
                sum = sum + input;
            } else {
                System.out.println("Cannot calculate the average");
            }
            
            
            
        }
        
        System.out.println(sum/numOfNums);

    }
}
