package classes.exercise9;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Stwórz program z klasą User, z następującymi danymi:
        - username,
        - password,
        - name,
        - surname.
        Stwórz przykładowe obiekty, zapisz je do ArrayListy.
        Stwórz metodę statyczną getAll, która zwraca wszystkich utworzonych użytkowników.*/


public class Main {
    public static void main(String[] args) {
        User user1 = new User("AdamKo", "1234", "Adam", "Kowalski");
        User user2 = new User("AnNo", "qwerty", "Anna", "Nowak");
        User user3 = new User("JaKw", "asdf", "Jan", "Kwiecień");
        User user4 = new User("KaMa", "4567", "Katarzyna", "Maj");
        System.out.println(User.getAllUsers());
    }
}
