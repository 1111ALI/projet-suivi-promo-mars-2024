package cm.adacorp.gestionrestaurant.controllers;


import cm.adacorp.gestionrestaurant.entity.Reservation;
import cm.adacorp.gestionrestaurant.services.interf.ReservationServiceInterf;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reservations")
public class ReservationController {
    private final ReservationServiceInterf reservationServiceInterf;

//    // Recuperer toutes les reservationss de la Table reservations dans la BD
//    @GetMapping("get-all")
//    public List<Reservation> getAllReservation() {
//        return reservationServiceInterf.getAllReservation();
//    }
//
//    // Enregistrement d'une Reservation
//    @PostMapping("create")
//    public Reservation createReservation(@RequestBody Reservation reservation) {
//
//        return reservationServiceInterf.createReservation(reservation);
//    }
//    // Supprimer une reservation
//    @DeleteMapping("{Id}")
//    public String deleteReservationById(@PathVariable("id") Long reservationId){
//        return reservationServiceInterf.deleteReservationById(reservationId);
//    }
//    // Chercher une reservation par son Id
//    @GetMapping("{Id}")
//    public Reservation getReservationById(@PathVariable("Id") Long reservationId){
//        return reservationServiceInterf.getReservationById(reservationId);
//    }
//    // Mettre à jour d'une reservation
//    @PutMapping("update")
//    public Map<String, String> updateReservationById(@RequestBody Reservation reservation, @PathVariable("Id") Long reservationId){
//        return reservationServiceInterf.updateReservationById(reservation, reservationId);
//    }

}
