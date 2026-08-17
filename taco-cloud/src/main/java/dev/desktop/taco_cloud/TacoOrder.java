package dev.desktop.taco_cloud;

// imports
import java.util.List;
import java.util.ArrayList;
import lombok.Data;

@Data 
public class TacoOrder {
    // stores info for deliverying the order and handleing payment
    private String deliveryName;
    private String deliveryStreet;
    private String deliveryCity;
    private String deliveryState;
    private String deliveryZipCode;
    private String ccNumber;
    private String ccExpiration;
    private String ccCVV;
    
    // stores info about the tacos within the order
    private List<Taco> tacos = new ArrayList<>();

    // adds taco to order
    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}