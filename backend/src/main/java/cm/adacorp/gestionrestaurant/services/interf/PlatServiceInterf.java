package cm.adacorp.gestionrestaurant.services.interf;

import cm.adacorp.gestionrestaurant.entity.Plat;

import java.util.List;
import java.util.Map;

public interface PlatServiceInterf {

    List<Plat> getAllPlat();


    Plat createPlat(Plat plat);

    String deletePlatById(Long platId);

    Plat getPlatById(Long platId);


    Map<String, String> updatePlatById(Plat plat, Long platId);
}
