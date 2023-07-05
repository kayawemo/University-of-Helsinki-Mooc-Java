
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kayod
 */
public class Room {

    private ArrayList<Person> rooms;

    public Room() {
        rooms = new ArrayList<>();
    }

    public void add(Person person) {
        this.rooms.add(person);
    }

    public boolean isEmpty() {
        return rooms.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.rooms;
    }

    public Person shortest() {

        if (rooms.isEmpty()) {
            return null;
        }

        Person shortestPerson = rooms.get(0);

        for (Person person : rooms) {
            if (shortestPerson.getHeight() > person.getHeight()) {
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

    public Person take() {
        if (rooms.isEmpty()) {
            return null;
        }

        Person shortest = this.shortest();

        this.rooms.remove(shortest);

        return shortest;
    }

}
