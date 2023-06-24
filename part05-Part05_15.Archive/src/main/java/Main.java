
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList<>();
       
        
        while (true) {
            
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            Archive ar = new Archive(identifier, name);
            
            if (list.contains(ar)){
                
            }else {
                list.add(ar);
            }
            
            
            //list.add(new Archive(identifier, name));
        }
        
        for(Archive arc : list){
            System.out.println(arc);
        }


    }
}
