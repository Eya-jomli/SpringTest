package com.example.eyajomliexblanc.DOA.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable {
    @Id
    private String idReservation;
    private Date dateReservation;
    private ClassPlace classPlace;
    private EtatReservation etatReservation;

    @ManyToOne
     Voyageur voyageur;

    @ManyToOne(cascade = CascadeType.ALL )
     Vol vol;
}
