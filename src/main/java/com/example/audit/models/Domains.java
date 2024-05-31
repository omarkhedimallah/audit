package com.example.audit.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Setter
    @Getter
    private Float poid;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "axe_id")
    private Axe axe;
@JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "domains")
    private Set<Criteria> criteria;

    public Domains()  {}

    public Domains(String nom)  {
        this.nom = nom;
    }

}
