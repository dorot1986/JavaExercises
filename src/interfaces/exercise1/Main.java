package interfaces.exercise1;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Zdefiniuj inteface Głos z metodą dajGlos.
        Stwórz 2 klasy Kot i Pies implementujące dany interfejs, zdefiniuj przykładowe dane.
        Stwórz ArrayListę zwierząt, wywołaj metodę dajGłos.*/


public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Klakier");
        Cat cat2 = new Cat("Bianka");
        Dog dog1 = new Dog("Burek");
        Dog dog2 = new Dog("Azor");

        cat1.getVoice();
        cat2.getVoice();
        dog1.getVoice();
        dog2.getVoice();
    }
}
