package ygor.garofalo.SpringData.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ygor.garofalo.SpringData.entities.Menu;


@Service
public class MenuService {

    @Autowired
    private MenuDao menuDao;

    public void save(Menu menu) {

        menuDao.save(menu);
        System.out.println("Menu salvato");
    }


    public Menu findByID(long id) {
        return menuDao.findById(id).orElseThrow(() -> new NullPointerException());
    }

}
