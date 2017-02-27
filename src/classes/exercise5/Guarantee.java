package classes.exercise5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Guarantee {
    private Product product;
    private LocalDate validUntil;

    public Guarantee(Product product, LocalDate validUntil) {
        this.product = product;
        this.validUntil = validUntil;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public boolean isValid(){
        if (validUntil.isAfter(LocalDate.now())){
            return true;
        }
        else{
            return false;
        }
    }
    public String guaranteeDescription(){
        if (isValid()){
            return "Gwarancja na produkt: " + product.getName() + " jest ważna do: " + validUntil;
        }
        else return "Gwarancja na produkt: " + product.getName() + " była ważna do: " + validUntil;
    }
}
