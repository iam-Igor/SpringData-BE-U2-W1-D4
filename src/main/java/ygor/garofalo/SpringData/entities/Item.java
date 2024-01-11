package ygor.garofalo.SpringData.entities;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
public abstract class Item {

    @Id
    @GeneratedValue
    private long id;

    private int calories;
    private double price;

    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

}
