import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private BirdDB birds;


    public UserInterface(Scanner scanner, BirdDB birds) {
        this.scanner = scanner;
        this.birds = birds;
    }

    public void start() {

        while (true) {

            System.out.print("?");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("Quit")) {
                break;
            }

            if (command.equalsIgnoreCase("Add")) {
                addBird();
            }

            if (command.equalsIgnoreCase("observation")) {
                observe();
            }

            if (command.equalsIgnoreCase("All")) {
                birds.displayAll();
            }

            if (command.equalsIgnoreCase("One")) {
                printOne();

            }

        }

    }

    private void printOne() {
        System.out.println("Bird? ");
        String oneName = scanner.nextLine();
        birds.displayOne(oneName);
    }

    private void observe() {
        System.out.print("Bird? ");
        String tobeObserved = scanner.nextLine();
        Boolean isObserved = birds.observation(tobeObserved);
        if (!isObserved) {
            System.out.println("Not a bird!");
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
