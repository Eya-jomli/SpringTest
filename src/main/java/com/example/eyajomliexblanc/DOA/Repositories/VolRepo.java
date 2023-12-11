package com.example.eyajomliexblanc.DOA.Repositories;

import com.example.eyajomliexblanc.DOA.Entities.Vol;
import com.example.eyajomliexblanc.Services.IVolService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



public interface VolRepo extends JpaRepository<Vol, Integer> {

}
