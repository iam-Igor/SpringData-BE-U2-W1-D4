package ygor.garofalo.SpringData.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "item_type")
@Table(name = "items")
@NoArgsConstructor
@Getter
@Setter
public abstract class Item {
    @Id
    @GeneratedValue
    private long id;

    private int calories;
    private double price;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @ManyToMany(mappedBy = "orderedProducts")
    private List<Order> orderList;


    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
