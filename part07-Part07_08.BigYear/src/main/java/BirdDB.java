import java.util.ArrayList;

public class BirdDB {

    private ArrayList<Bird> birds;
    //private Bird bird;

    public BirdDB() {
        this.birds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public void displayAll() {
        for (Bird bird : birds) System.out.println(bird);
    }
    public void displayOne(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(bird);
            }
        }
    }

    public boolean observation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.observe();
                return true;
            }
        }
        return false;
    }
}
