package com.example.audit.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Data
public class Domains {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @Getter
    private String nom;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "axe_id")
    private Axe axe;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "domains")
    private Set<Criteria> criteria;

    public Domains()  {}

    public Domains(String nom)  {
        this.nom = nom;
    }

}
