package ygor.garofalo.SpringData.entities;

import jakarta.persistence.*;
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


    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;


    public Topping(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

}
