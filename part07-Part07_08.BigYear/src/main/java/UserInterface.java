import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdDB birds;
    private Bird bird;

    public UserInterface(Scanner scanner, BirdDB birds) {
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start() {

        while (true) {

            System.out.print("?");
            String command = scanner.nextLine();

            if (command.equals("Quit")) {
                break;
            }

            if (command.equals("Add")) {
                addBird();
            }

            if (command.equals("observation")){
                System.out.print("Bird? ");
                String tobeObserved = scanner.nextLine();
                birds.observeInList(tobeObserved);
            }

            if(command.equals("All")) {
                birds.displayAll();
            }

            if (command.equals("One")) {
                System.out.println("Bird? ");
                String oneName = scanner.nextLine();
                birds.displayOne(oneName);
            }

        }

    }

    private void addBird() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.println("Name in Latin: ");
        String latinName = scanner.nextLine();

        birds.addBird(new Bird(name, latinName));
    }
}
