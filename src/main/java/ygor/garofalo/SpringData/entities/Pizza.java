package ygor.garofalo.SpringData.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Pizza extends Item {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "pizza_id")
    private List<Topping> toppingList;
    private boolean isXl = false;


    public Pizza(String name, List<Topping> toppingList, boolean isXl) {
        super(700, 4.3);
        this.name = name;
        this.toppingList = toppingList;
        this.isXl = isXl;
    }


}
