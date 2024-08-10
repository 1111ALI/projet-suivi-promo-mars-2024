package cm.adacorp.gestionrestaurant.entity;

import cm.adacorp.gestionrestaurant.enums.CathegoriePlat;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "plats")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Plat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long platId;
    private String nomPlat;
    private Set<CathegoriePlat> cathegoriePlat;
    private String restaurantConcerne;
    private int prixPlat;
}
