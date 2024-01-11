package ygor.garofalo.SpringData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import ygor.garofalo.SpringData.DAO.PizzaService;
import ygor.garofalo.SpringData.entities.Pizza;

@Component
public class MainRunner implements CommandLineRunner {

    @Autowired
    PizzaService pizzaService;

    @Override
    public void run(String... args) throws Exception {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDataApplication.class);


        Pizza margherita = ctx.getBean("pizza_margherita", Pizza.class);

        pizzaService.savePizza(margherita);

        pizzaService.filterByCalories(700);

        pizzaService.filterByName("Pizza Margherita");

        pizzaService.filterBYId(1);


    }
}
