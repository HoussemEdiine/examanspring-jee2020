package com.example.exman2020spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private int age;
    private Date dateDeRecrutement;
    private String login;
    private String password;
    @Enumerated(EnumType.STRING)
    private Poste poste;
    @ManyToOne
    private Zone zoneGuard;
    @OneToOne
    private Zone zoneRes;

}
