package com.example.eyajomliexblanc.DOA.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.example.eyajomliexblanc.DOA.Entities.Aeropport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Aeropport")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aeropport implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAeropport;
    private String nom;
    private String codeAITA;
    private long telephone;

    @OneToMany
    private
    List<Vol> arrive=new ArrayList<>();

    @OneToMany
    private List<Vol> depart=new ArrayList<>();

}
