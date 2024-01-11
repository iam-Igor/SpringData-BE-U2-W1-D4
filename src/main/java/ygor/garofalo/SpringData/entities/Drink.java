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
public class Drink extends Item {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

}
