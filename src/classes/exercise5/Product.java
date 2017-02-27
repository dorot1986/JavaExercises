package classes.exercise5;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Product {
    private String name;
    private String description;
    private String specyfication;

    public Product(String name, String description, String specyfication) {
        this.name = name;
        this.description = description;
        this.specyfication = specyfication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecyfication() {
        return specyfication;
    }

    public void setSpecyfication(String specyfication) {
        this.specyfication = specyfication;
    }
}
