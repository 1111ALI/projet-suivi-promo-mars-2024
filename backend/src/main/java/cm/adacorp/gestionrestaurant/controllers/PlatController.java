package cm.adacorp.gestionrestaurant.controllers;

import cm.adacorp.gestionrestaurant.entity.Plat;
import cm.adacorp.gestionrestaurant.services.interf.PlatServiceInterf;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/plats")
public class PlatController {
    private final PlatServiceInterf platServiceInterf;

    // Recuperer tous les plats de la Table plats dans la BD
    @GetMapping("get-all")
    public List<Plat> getAllPlat() {
        return platServiceInterf.getAllPlat();
    }

    // Enregistrement d'un Plat
    @PostMapping("create")
    public Plat createPlat(@RequestBody Plat plat) {
        return platServiceInterf.createPlat(plat);
    }
    // Supprimer un plat
    @DeleteMapping("{Id}")
    public String deletePlatById(@PathVariable("id") Long platId){

        return platServiceInterf.deletePlatById(platId);
    }
    // Chercher un plat par son Id
    @GetMapping("{Id}")
    public Plat getPlatById(@PathVariable("Id") Long platId){

        return platServiceInterf.getPlatById(platId);
    }
    // Mettre à jour un menu
    @PutMapping("update")
    public Map<String, String> updatePlatById(@RequestBody Plat plat, @PathVariable("Id") Long platId){
        return platServiceInterf.updatePlatById(plat, platId);
    }

}
