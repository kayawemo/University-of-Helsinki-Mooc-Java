
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String name = scan.nextLine();

        int counter = 0;
        int won = 0;
        int loss = 0;

        // we create a scanner for reading the file
        try ( Scanner scanner = new Scanner(Paths.get(file))) {

            // we read all the lines of the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] teams = line.split(",");

                String teamName1 = teams[0];
                String teamName2 = teams[1];
                int team1Points = Integer.valueOf(teams[2]);
                int team2Points = Integer.valueOf(teams[3]);

                if (line.contains(name)) {
                    counter++;

                    //When name is on the left
                    if (name.equals(teamName1)) {
                        if (team1Points > team2Points) {
                            won++;
                        } else {
                            loss++;
                        }
                    }

                    //When name is on the right
                    if (name.equals(teamName2)) {
                        if (team2Points > team1Points) {
                            won++;
                        } else {
                            loss++;
                        }
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + counter);
        System.out.println("Wins: " + won);
        System.out.println("Losses: " + loss);


    }

}
