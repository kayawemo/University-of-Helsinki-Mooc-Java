import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
<<<<<<< HEAD
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Title:");
            String title = scanner.nextLine();
            
            if(title.isEmpty()){
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication Year:");
            int publication = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, publication));
        }
        
        System.out.println("What information will be printed?");
        String info = scanner.nextLine();
        
        for (Book book : books){
            if(info.equals("everything")) {
                System.out.println(book);
            }else if(info.equals("name")){
                System.out.println(book.getTitle());
            }
        }
=======
>>>>>>> 498105c862e600fc03f788af25c3cea9050b6215

    }
}
