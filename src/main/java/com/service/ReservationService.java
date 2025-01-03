package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ReservationDAO;
import com.model.Reservation;

import java.util.List;
import java.sql.Date;

@Service
public class ReservationService {

    @Autowired
    private ReservationDAO reservationDAO;

    public boolean findReservation(Reservation reservation) {
    
        return reservationDAO.existsById(reservation.getReservation_id());
    }

    public void saveReservation(Reservation reservation) {
        reservationDAO.save(reservation);
    }

    public List<Reservation> getAllReservations() {
        return reservationDAO.findAll();
    }

    public Reservation getReservationById(Long id) {
        return reservationDAO.findById(id).orElse(null);
    }

    public List<Reservation> getReservationsByDateRange(String startDate, String endDate) {
        Date start = Date.valueOf(startDate);
        Date end = Date.valueOf(endDate);
        return reservationDAO.findByCheckInDateBetween(start, end);
    }

    public boolean findById(Long id) {
        return reservationDAO.existsById(id);
    }

    public void updateReservation(Long id, Reservation reservation) {
        if (reservationDAO.existsById(id)) {
            reservation.setReservation_id(id);
            reservationDAO.save(reservation);
        }
    }

    public void deleteReservation(Long id) {
        if (reservationDAO.existsById(id)) {
            reservationDAO.deleteById(id);
        }
    }
}
