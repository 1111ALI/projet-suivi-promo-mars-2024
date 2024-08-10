package cm.adacorp.gestionrestaurant.services.interf;

import cm.adacorp.gestionrestaurant.entity.Menu;

import java.util.List;
import java.util.Map;

public interface MenuServiceInterf {
    List<Menu> getAllMenu();

    Menu createMenu(Menu menu);

    String deleteMenuById(Long menuId);

    Menu getMenuById(Long menuId);

    Map<String, String> updateMenuById(Long menuId, Menu menu);
}
