package com.example.eyajomliexblanc.RestControllers;

import com.example.eyajomliexblanc.DOA.Entities.Vol;
import com.example.eyajomliexblanc.Services.IVolService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vol")
@AllArgsConstructor

public class VolRestController {
    @Autowired
    IVolService iVolService;
 //   @PostMapping("/add")
  //  Vol addVol(@RequestBody Vol v){
    //    return iVolService.addVol(v);
   // }
}
