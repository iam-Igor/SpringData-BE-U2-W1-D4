package ygor.garofalo.SpringData.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Pizza extends Item {


    private String name;


    @ManyToMany
    @JoinTable(name = "toppings_pizzas", joinColumns = @JoinColumn(name = "pizzas"), inverseJoinColumns = @JoinColumn(name = "toppings"))
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
                "id=" + super.getId() +
                ", name='" + name + '\'' +
                ", isXl=" + isXl +
                '}';
    }
}
