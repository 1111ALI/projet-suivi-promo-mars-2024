package cm.adacorp.gestionrestaurant.controllers;

import cm.adacorp.gestionrestaurant.entity.Menu;
import cm.adacorp.gestionrestaurant.services.interf.MenuServiceInterf;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/menus")
public class MenuController {
    private final MenuServiceInterf menuServiceInterf;

    // Recuperer tous les menus de la Table menus dans la BD
    @GetMapping("get-all")
    public List<Menu> getAllMenu() {

        return menuServiceInterf.getAllMenu();
    }

    // Enregistrement d'un menu
    @PostMapping("create")
    public Menu createMenu(@RequestBody Menu menu) {

        return menuServiceInterf.createMenu(menu);
    }

    // Supprimer un menu
    @DeleteMapping("{id}")
    public String deleteMenuById(@PathVariable("id") Long menuId) {

        return menuServiceInterf.deleteMenuById(menuId);
    }

    // Chercher un menu par son Id
    @GetMapping("{id}")
    public Menu getMenuById(@PathVariable("id") Long menuId) {

        return menuServiceInterf.getMenuById(menuId);
    }

    // Mettre à jour un menu
    @PutMapping("{id}")
    public Map<String, String> updateMenuById(@PathVariable("id") Long menuId, @RequestBody Menu menu) {
        return menuServiceInterf.updateMenuById(menuId, menu);
    }
}
