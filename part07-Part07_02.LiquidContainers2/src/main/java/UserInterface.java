
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kayod
 */
public class UserInterface {

    Container cont1 = new Container();
    Container cont2 = new Container();
    Scanner scan = new Scanner(System.in);

    public void start() {

        while (true) {

            System.out.println("First: " + cont1.toString());
            System.out.println("Second: " + cont2.toString());

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                cont1.add(amount);
            }

           

            if (command.equals("move") && amount > 0) {
                if (cont1.contains() > 0) {
                    if (cont1.contains() - amount < 0) {
                        cont2.setNumber(cont1.contains());
                        cont1.setNumber(0); 
                    } else {
                        cont1.setNumber(cont1.contains() - amount);
                        cont2.setNumber(cont2.contains() + amount);
                    }
                }

                if (cont2.contains() > 100) {
                    cont2.setNumber(100); 
                }
            }
            
            if (command.equals("remove")) {

                cont2.remove(amount);

            }
        }
    }

}
