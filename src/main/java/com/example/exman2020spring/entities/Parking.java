package com.example.exman2020spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parking implements Serializable {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;
    private  String designation ;
    private  String adresse ;
    private  int capacite ;
    @OneToMany(mappedBy = "parking",cascade = CascadeType.ALL)
    List<Zone> zoneSet = new ArrayList<Zone>();

}
