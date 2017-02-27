package classes.exercise3;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Player {
    private String name;
    private String surname;
    private String username;
    private int points;

    public Player(String name, String surname, String username, int points) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String fullName(){
        return name + " " + surname;
    }
}
