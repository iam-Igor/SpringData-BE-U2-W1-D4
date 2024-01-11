package ygor.garofalo.SpringData.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ygor.garofalo.SpringData.entities.Menu;

@Repository
public interface MenuDao extends JpaRepository<Menu, Long> {


}
