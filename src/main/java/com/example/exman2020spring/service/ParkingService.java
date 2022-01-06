package com.example.exman2020spring.service;

import com.example.exman2020spring.entities.Parking;
import com.example.exman2020spring.entities.Zone;

import java.util.List;

public interface ParkingService {
    void  ajoutParkingetZones(Parking parking , List<Zone> zones);
}
