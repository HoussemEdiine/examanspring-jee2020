package com.example.exman2020spring.controller;

import com.example.exman2020spring.entities.Parking;
import com.example.exman2020spring.entities.Personnel;
import com.example.exman2020spring.service.ParkingService;
import com.example.exman2020spring.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class ControllerGlobal {
    @Autowired
    PersonnelService personnelService;
    @Autowired
    ParkingService parkingService ;
    @PostMapping("/personnel")
    public  void ajoutPersonnel(@RequestBody Personnel personnel){
         personnelService.ajouterPersonnel(personnel);
    }
    @PostMapping("/parkingetzone")
    public  void  ajoutParkingetZones(@RequestBody Parking parking){
        System.out.println(parking);
        System.out.println(parking.getZoneSet());
              parkingService.ajoutParkingetZones(parking,parking.getZoneSet());
    }
}
