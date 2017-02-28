package interfaces.exercise1;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Dog implements Voice {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void getVoice(){
        System.out.println("Hau, hau");
    }
}
