package com.example.audit.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Axe implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "axes")
    private List<Mission> missions;

    @OneToMany(cascade =CascadeType.ALL)
    private Set<Domains> Domains;


    public Axe(String nom)  {
        this.nom = nom;
    }

}

