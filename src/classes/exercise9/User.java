package classes.exercise9;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class User {
    private String username;
    private String password;
    private String name;
    private String surname;
    private static List<User> users = new ArrayList<User>();

    public User(String username, String password, String name, String surname) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        User.users.add(this);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public static List<String> getAllUsers(){
        List<String> users = new ArrayList<String>();
        for (User u:User.users) {
            users.add(u.getUsername());
        }
        return users;
    }
}
