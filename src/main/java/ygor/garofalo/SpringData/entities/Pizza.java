package ygor.garofalo.SpringData.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Pizza extends Item {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

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

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", menu=" + menu +
                ", isXl=" + isXl +
                '}';
    }
}
