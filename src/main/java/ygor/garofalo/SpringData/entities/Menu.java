package ygor.garofalo.SpringData.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @Autowired
    @OneToMany(mappedBy = "menu")
    private List<Pizza> pizzaList;

    @Autowired
    @OneToMany(mappedBy = "menu")
    private List<Drink> drinkList;

    @Autowired
    @OneToMany(mappedBy = "menu")
    private List<Topping> toppingList;


    public Menu(String name) {
        this.name = name;
    }

    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzaList.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.drinkList.forEach(System.out::println);
        System.out.println();

    }
}
