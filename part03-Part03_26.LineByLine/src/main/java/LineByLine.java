
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputWords;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            inputWords = input.split(" ");
             for(String word : inputWords){
                 System.out.println(word);
             }
        }

    }
}
