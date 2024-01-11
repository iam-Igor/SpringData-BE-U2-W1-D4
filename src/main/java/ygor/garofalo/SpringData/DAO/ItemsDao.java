package ygor.garofalo.SpringData.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ygor.garofalo.SpringData.entities.Item;

@Repository
public interface ItemsDao extends JpaRepository<Item, Long> {


}
