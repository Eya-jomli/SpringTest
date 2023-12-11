package com.example.eyajomliexblanc.Services;

import com.example.eyajomliexblanc.DOA.Entities.Voyageur;
import com.example.eyajomliexblanc.DOA.Repositories.VoyageurRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoyageurService {
    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {

        return VoyageurRepo.saveAll(voyageurs);
    }
}
