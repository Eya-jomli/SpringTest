package com.example.eyajomliexblanc.DOA.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.example.eyajomliexblanc.DOA.Entities.Vol;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Vol")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVol;
    private Date dateDepart;
    private Date dateArrive;

@OneToMany(mappedBy = "vol")
    private Set<Reservation> reservations;


}
