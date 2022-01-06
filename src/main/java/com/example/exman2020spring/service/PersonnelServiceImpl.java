package com.example.exman2020spring.service;

import com.example.exman2020spring.entities.Personnel;
import com.example.exman2020spring.repository.PersonnelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonnelServiceImpl implements PersonnelService{
    @Autowired
    PersonnelRepository personnelRepository ;
    @Override
    public void ajouterPersonnel(Personnel personnel) {
        personnelRepository.save(personnel);
    }
}
