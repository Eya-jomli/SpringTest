package com.example.eyajomliexblanc.DOA.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Voyageur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Voyageur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVoyageur;
    private String nom;
    private String prenom;
    private Date dateNaissance;

   @OneToMany
    //@JsonIgnore
   //private Set<Reservation> reservations = new HashSet<>();
    private Set<Reservation> reservations;
}
