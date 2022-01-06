package com.example.exman2020spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "zones")
public class Zone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ref;
    private float demension;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parking_id")
    Parking parking;
    @OneToMany(mappedBy = "zoneGuard", cascade = CascadeType.ALL)
    Set<Personnel> personnelSet;
    @OneToOne(mappedBy = "zoneRes", cascade = CascadeType.ALL)
    Personnel personnel;


}
