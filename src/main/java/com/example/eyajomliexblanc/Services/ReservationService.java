package com.example.eyajomliexblanc.Services;

import com.example.eyajomliexblanc.DOA.Entities.Reservation;
import com.example.eyajomliexblanc.DOA.Repositories.*;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Override
    public Reservation addReservation(Reservation reservation) {
        return ReservationRepo.save(reservation);
    }

}
