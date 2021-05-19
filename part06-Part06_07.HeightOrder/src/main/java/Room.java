/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Velux
 */
import java.util.ArrayList;

public class Room {

    ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortest = persons.get(0);
        for (Person item : persons) {
            if (shortest.getHeight() > item.getHeight()) {
                shortest = item;
            }
        }
        return shortest;
    }

    public Person take() {
        if (persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;

    }
}
