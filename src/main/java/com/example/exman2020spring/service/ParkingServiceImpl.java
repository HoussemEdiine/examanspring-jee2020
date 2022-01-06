package com.example.exman2020spring.service;

import com.example.exman2020spring.entities.Parking;
import com.example.exman2020spring.entities.Zone;
import com.example.exman2020spring.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingServiceImpl implements  ParkingService {
    @Autowired
    ParkingRepository parkingRepository;
    @Override
    public void ajoutParkingetZones(Parking parking, List<Zone> zones) {
           zones.forEach(zone -> {
               zone.setParking(parking);
           });
        parking.setZoneSet(zones);


        parkingRepository.save(parking);

    }
}
