package com.example.audit.Services;

import com.example.audit.models.Axe;

import java.util.List;


public interface IAxeService {

    List<Axe> getAllAxes();

    Axe getAxeById(Long id);

    Axe saveAxe(Axe axe);

    void deleteAxe(Long id);
}
