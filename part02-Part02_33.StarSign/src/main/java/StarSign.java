
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
<<<<<<< HEAD
=======
        for(int i = 0; i <number; i++) {
            System.out.print("*");
            
        }
        System.out.println("");
>>>>>>> 498105c862e600fc03f788af25c3cea9050b6215
    }

    public static void printSquare(int size) {
        // second part of the exercise
<<<<<<< HEAD
=======
        for(int i = 0; i <size; i++) {
            printStars(size);
            System.out.println("");
        }
        
>>>>>>> 498105c862e600fc03f788af25c3cea9050b6215
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
<<<<<<< HEAD
=======
        for(int i = 0; i <height; i++) {
            printStars(width);
            System.out.println("");
        }
>>>>>>> 498105c862e600fc03f788af25c3cea9050b6215
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
<<<<<<< HEAD
=======
        for(int i = 0; i <size; i++) {
            for(int j = 0; j <= i; j++) {
                printStars(1);
            }
            System.out.println("");
        }
        
>>>>>>> 498105c862e600fc03f788af25c3cea9050b6215
    }
}
