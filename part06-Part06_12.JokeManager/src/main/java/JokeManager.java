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
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokeList;

    public JokeManager() {
        this.jokeList = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokeList.add(joke);
    }

    public String drawJoke() {
        if (jokeList.isEmpty()) {
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        return jokeList.get(rand.nextInt(jokeList.size()));

    }

    public void printJokes() {
        for (String joke : jokeList) {
            System.out.println(joke);
        }
    }

}
