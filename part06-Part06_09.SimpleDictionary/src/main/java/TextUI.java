
import java.text.MessageFormat;
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
public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDictionary) {
        this.scanner = scanner;
        this.simpleDictionary = simpleDictionary;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Comand: ");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye");
                break;
            }
            
            if (command.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                
                simpleDictionary.add(word, translation);
                
                continue;
            }
            
            if (command.equals("search")) {
                
                System.out.println("To be translated: ");
                String toBeTranslated = scanner.nextLine();
               
                String translated = simpleDictionary.translate(toBeTranslated);
                
                if(translated == null){
                    System.out.println(MessageFormat.format("Word {0} was not found", toBeTranslated));
                } else {
                    System.out.println("Translation: " + translated);
                }
                
                continue;
            }
            System.out.println("Unknown command");
        }
        
    }
}
