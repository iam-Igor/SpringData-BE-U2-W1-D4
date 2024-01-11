package ygor.garofalo.SpringData.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ygor.garofalo.SpringData.entities.Pizza;

import java.util.List;

@Repository
public interface PizzaDao extends JpaRepository<Pizza, Long> {


    @Query("SELECT p FROM Pizza p WHERE p.calories = :calories")
    List<Pizza> findByCaloriesEquals(@Param("calories") int calories);

    List<Pizza> findByName(String name);

    Pizza findById(long id);

}
