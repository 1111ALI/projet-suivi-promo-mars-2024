package cm.adacorp.gestionrestaurant.entity;

import jakarta.persistence.*;
import lombok.*;
@Data
@Table(name = "menus")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId;
    private String nomMenu;
    private String descriptionMenu;
    private int prixMenu;
    private String restaurantConcerne;
}
