package com.example.eyajomliexblanc.RestControllers;

import com.example.eyajomliexblanc.Services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reservation")
@AllArgsConstructor

public class ReservationRestController {
    @Autowired
    IReservationService iReservationService;


}
