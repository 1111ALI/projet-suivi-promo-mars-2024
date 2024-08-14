package cm.adacorp.gestionrestaurant.services.impl;


import cm.adacorp.gestionrestaurant.entity.Reservation;
import cm.adacorp.gestionrestaurant.repository.ReservationRepository;
import cm.adacorp.gestionrestaurant.services.interf.ReservationServiceInterf;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationServiceInterf {
    private final ReservationRepository reservationRepository;

//    @Override
//    public List<Reservation> getAllReservation() {
//        List<Reservation> reservationList = reservationRepository.findAll();
//        return reservationList;
//    }
//    @Override
//    public Reservation createReservation(Reservation reservation) {
//        return reservationRepository.save(reservation);
//    }
//
//
//    @Override
//    public String deleteReservationById(Long reservationId) {
//        Reservation reservationToDelete = reservationRepository.findById(reservationId)
//                .orElseThrow(() -> new RuntimeException(" La reservation n'exite pas dans la BD"));
//        reservationRepository.deleteById(reservationId);
//        return "Le reservation avec Id : " + reservationId + " supprimé avec succès !";
//    }
//
//    @Override
//    public Reservation getReservationById(Long reservationId) {
//        Reservation reservationToGet = reservationRepository.findById(reservationId)
//                .orElseThrow(() -> new RuntimeException("La Reservation n'existe pas dans la BD"));
//        return reservationToGet;
//    }
//
//    @Override
//    public Map<String, String> updateReservationById(Reservation reservation, Long reservationId) {
//        Map<String, String> reponse = new HashMap<>();
//        Optional<Reservation> existingReservation = reservationRepository.findById(reservationId);
//        if (!existingReservation.isPresent()) {
//            reponse.put("status", "failed");
//            reponse.put("message", " la Reservation de Id " + reservationId + " n'existe pas ");
//        } else {
//            Reservation user = existingReservation.get();
//            user.setNumeroTable(reservation.getNumeroTable());
//            user.setNomClient(reservation.getNomClient());
//            user.setDateReservation(reservation.getDateReservation());
//            user.setStatutReservation(reservation.getStatutReservation());
//            user.setCapaciteTable(reservation.getCapaciteTable());
//            user.setRestaurantConcerne(reservation.getRestaurantConcerne());
//            user.setPrixPlat(reservation.getPrixPlat());
//
//            reservationRepository.save(user);
//            reponse.put("status", "succes");
//            reponse.put("message", " le Plat numero " + reservationId + " a été mis à jour ");
//        }
//        return reponse;
  //  }


}
