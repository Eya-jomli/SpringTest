package com.example.eyajomliexblanc.Services;

import com.example.eyajomliexblanc.DOA.Entities.Vol;
import com.example.eyajomliexblanc.DOA.Entities.Voyageur;

import java.util.List;

public interface IVolService {
    List<Voyageur> ajouterVoyageurs(List<Voyageur>voyageurs);
    public String AjouterVolETAeroport(Vol vol);
}
