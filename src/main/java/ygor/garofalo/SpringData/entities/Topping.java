package ygor.garofalo.SpringData.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Topping extends Item {


    private String name;


    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

}
