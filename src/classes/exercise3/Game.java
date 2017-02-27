package classes.exercise3;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Game {
    private String name;
    private Player[] players;

    public Game(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public void getWinner(){
        int maxScore = 0;
        int tempIndex = 0;
        for (int i=0; i<players.length; i++) {
            if (players[i].getPoints() > maxScore) {
                maxScore = players[i].getPoints();
                tempIndex = i;
            }
        }
        if (maxScore>100) {
            System.out.println("Wygrywa: " + players[tempIndex].fullName());
        }
        else{
            System.out.println("Nikt nie wygrał gry.");
        }
    }
}
