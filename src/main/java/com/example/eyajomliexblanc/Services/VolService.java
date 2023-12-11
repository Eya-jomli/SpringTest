package com.example.eyajomliexblanc.Services;

import com.example.eyajomliexblanc.DOA.Entities.Vol;
import com.example.eyajomliexblanc.DOA.Entities.Voyageur;
import com.example.eyajomliexblanc.DOA.Repositories.VolRepo;
import com.example.eyajomliexblanc.DOA.Repositories.VoyageurRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service

public class VolService  implements IVolService{
    @Autowired
    VolRepo volRepo;
    @Override
    public String AjouterVolETAeroport(Vol vol) {
        List<Vol> arrive=new ArrayList<>();
        List<Vol> depart=new ArrayList<>();
        VolRepo.save(vol);
        return "le vol est ajouté avec succes" ;
    }





   /* @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        return null;
    }*/
}
