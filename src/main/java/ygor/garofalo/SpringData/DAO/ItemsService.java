package ygor.garofalo.SpringData.DAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ygor.garofalo.SpringData.entities.Item;
import ygor.garofalo.SpringData.entities.Menu;

@Service
public class ItemsService {

    @Autowired
    private ItemsDao itemsDao;


    public void saveItem(Item item, Menu menu) {

        if (item != null) {
            item.setMenu(menu);
            itemsDao.save(item);
            System.out.println("Item salvato");
        } else {
            System.out.println("Errore nel salvataggio.");
        }

    }

}
