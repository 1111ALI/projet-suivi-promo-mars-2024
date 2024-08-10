package cm.adacorp.gestionrestaurant.repository;

import cm.adacorp.gestionrestaurant.entity.Plat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatRepository extends JpaRepository<Plat, Long> {
}
