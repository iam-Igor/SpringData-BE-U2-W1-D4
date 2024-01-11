package ygor.garofalo.SpringData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import ygor.garofalo.SpringData.DAO.ItemsService;
import ygor.garofalo.SpringData.DAO.MenuService;
import ygor.garofalo.SpringData.entities.Menu;
import ygor.garofalo.SpringData.entities.Pizza;
import ygor.garofalo.SpringData.entities.Topping;

@Component
public class MainRunner implements CommandLineRunner {

    @Autowired
    ItemsService itemsService;

    @Autowired
    MenuService menuService;

    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDataApplication.class);

        Menu m = new Menu("Menu ristorante");
        menuService.save(m);
        Pizza margherita = ctx.getBean("pizza_margherita", Pizza.class);

        Topping tomato = ctx.getBean("toppings_tomato", Topping.class);
        Topping cheese = ctx.getBean("toppings_cheese", Topping.class);

        itemsService.saveItem(tomato, m);
        itemsService.saveItem(cheese, m);


        itemsService.saveItem(margherita, m);


    }
}
