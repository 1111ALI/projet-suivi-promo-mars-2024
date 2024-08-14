package cm.adacorp.gestionrestaurant.entity;

import cm.adacorp.gestionrestaurant.enums.Statut;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "reservations")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long reservationId;
    private Long nomClient;
    private Date dateReservation;
    private String numeroTable;
    private String capaciteTable;
    private Set<Statut> statutReservation;
    private String restaurantConcerne;
    private int prixPlat;
}
