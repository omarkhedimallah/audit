package com.example.audit.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Entity
public class Mission {

    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @Getter
    private String nom;
    @ManyToOne
    @JoinColumn(name = "Userr")
    Userr Userr;
    @ManyToMany
    @JoinTable(
            name = "mission_axe",
            joinColumns = @JoinColumn(name = "mission_id"),
            inverseJoinColumns = @JoinColumn(name = "axe_id")
    )
    private List<Axe> axes;
    public Mission()  {}
    public Mission(String nom)  {
        this.nom = nom;
    }

}


