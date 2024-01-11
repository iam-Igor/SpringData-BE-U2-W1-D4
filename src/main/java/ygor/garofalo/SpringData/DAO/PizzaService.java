package ygor.garofalo.SpringData.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ygor.garofalo.SpringData.entities.Pizza;

@Service
public class PizzaService {

    @Autowired
    private PizzaDao pizzaDao;


    public void savePizza(Pizza pizza) {

        pizzaDao.save(pizza);
        System.out.println("Pizza Salvata nel DB");
    }

    public void filterByCalories(int calories) {
        pizzaDao.findByCaloriesEquals(calories).forEach(System.out::println);
    }

    public void filterByName(String name) {
        pizzaDao.findByName(name).forEach(System.out::println);
    }


    public void filterBYId(long id) {
        System.out.println(pizzaDao.findById(id));
    }
}
