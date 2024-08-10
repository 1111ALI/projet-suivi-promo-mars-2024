package cm.adacorp.gestionrestaurant.services.impl;

import cm.adacorp.gestionrestaurant.entity.Menu;
import cm.adacorp.gestionrestaurant.repository.MenuRepository;
import cm.adacorp.gestionrestaurant.services.interf.MenuServiceInterf;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MenuServiceImpl implements MenuServiceInterf {
    private final MenuRepository menuRepository;


    @Override
    public List<Menu> getAllMenu() {
        List<Menu> menuList = menuRepository.findAll();
        return menuList;
    }

    @Override
    public Menu createMenu(Menu menu) {
        return menuRepository.save(menu);
    }
    @Override
    public String deleteMenuById(Long menuId) {
        Menu clientToBeDelete = menuRepository.findById(menuId)
                .orElseThrow(() -> new RuntimeException(" Le client n'exite pas dans la BD"));
        menuRepository.deleteById(menuId);
        return "Menu avec Id : " + menuId + " supprimé avec succès !";
    }

    @Override
    public Menu getMenuById(Long menuId) {
        Menu menuToGet = menuRepository.findById(menuId)
                .orElseThrow(()->new RuntimeException("Le Menu n'existe pas dans la BD "));
        return menuToGet;
    }

    @Override
    public Map<String, String> updateMenuById(Long menuId, Menu menu) {
        Map<String, String> reponse = new HashMap<>();
        Optional<Menu> existingMenu = menuRepository.findById(menuId);
        if (!existingMenu.isPresent()) {
            reponse.put("status", "failed");
            reponse.put("message", " le Menu de Id " + menuId + " n'existe pas ");
        } else {
            Menu user = existingMenu.get();
            user.setNomMenu(menu.getNomMenu());
            user.setDescriptionMenu(menu.getDescriptionMenu());
            user.setRestaurantConcerne(menu.getRestaurantConcerne());
            user.setPrixMenu(menu.getPrixMenu());
            menuRepository.save(user);
            reponse.put("status", "succes");
            reponse.put("message", " l'utilisateur de Id " + menuId + " a été mis à jour ");
        }
        return reponse;
    }

}
