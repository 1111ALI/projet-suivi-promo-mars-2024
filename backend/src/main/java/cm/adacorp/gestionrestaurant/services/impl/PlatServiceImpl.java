package cm.adacorp.gestionrestaurant.services.impl;

import cm.adacorp.gestionrestaurant.entity.Menu;
import cm.adacorp.gestionrestaurant.entity.Plat;
import cm.adacorp.gestionrestaurant.repository.PlatRepository;
import cm.adacorp.gestionrestaurant.services.interf.PlatServiceInterf;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlatServiceImpl implements PlatServiceInterf {
    private final PlatRepository platRepository;


    @Override
    public List<Plat> getAllPlat() {
        List<Plat> platList = platRepository.findAll();
        return platList;
    }

    @Override
    public Plat createPlat(Plat plat) {
        return platRepository.save(plat);
    }

    @Override
    public String deletePlatById(Long platId) {
        Plat platToDelete = platRepository.findById(platId)
                .orElseThrow(() -> new RuntimeException(" Le plat n'exite pas dans la BD"));
        platRepository.deleteById(platId);
        return "Le plat avec Id : " + platId + " supprimé avec succès !";
    }

    @Override
    public Plat getPlatById(Long platId) {
        Plat platToGet = platRepository.findById(platId)
                .orElseThrow(() -> new RuntimeException("Le Plat n'existe pas dans la BD"));
        return platToGet;
    }

    @Override
    public Map<String, String> updatePlatById(Plat plat, Long platId) {
        Map<String, String> reponse = new HashMap<>();
        Optional<Plat> existingPlat = platRepository.findById(platId);
        if (!existingPlat.isPresent()) {
            reponse.put("status", "failed");
            reponse.put("message", " le plat de Id " + platId + " n'existe pas ");
        } else {
            Plat user = existingPlat.get();
            user.setNomPlat(plat.getNomPlat());
            user.setCathegoriePlat(plat.getCathegoriePlat());
            user.setPrixPlat(plat.getPrixPlat());
            user.setRestaurantConcerne(plat.getRestaurantConcerne());
            platRepository.save(user);
            reponse.put("status", "succes");
            reponse.put("message", " le Plat numero " + platId + " a été mis à jour ");
        }
        return reponse;
    }

}
