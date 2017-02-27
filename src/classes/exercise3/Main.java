package classes.exercise3;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Zdefiniuj dwie klasy odpowiedzialne za przechowywanie informacji o Grze oraz Zawodniku.
        Klasa Game powinna zawierać:
        - name,
        - players.
        Klasa Player powinna zawierać:
        - name,
        - username,
        - points.
        Klasa Game powinna zawierać również metodę 'winner', która wypisuje na ekranie imię i
        nazwisko wygrywającego. Wygrywa zawodnik, który posiada więcej niż 100 punktów. Jeśli
        dwaj zawodnicy mają więcej niż 100 punktów, wygrywa ten, który ma ich więcej.
        Klasa Player powinna zawierać metodę 'fullName' zwracającą, która powinna wypisać imię i
        nazwisko gracza.*/


public class Main {
    public static void main(String[] args) {
        Player[] basketballPlayers = {new Player("Adam", "Kowalski", "adamKow", 100),
                new Player("Anna", "Nowak", "anNow", 101),
                new Player("Jan", "Kwiecień", "janK", 90),};
        Game basketball = new Game("basketball", basketballPlayers);

        basketball.getWinner();

    }
}
