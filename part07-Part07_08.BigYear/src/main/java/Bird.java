public class Bird {

    private String name;
    private String latinName;
    private int observation;

    public int getObservation() {
        return observation;
    }

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void observe() {
        observation++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observation + " observations";
    }
}
