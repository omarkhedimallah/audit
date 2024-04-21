package com.example.audit.controllers;

import com.example.audit.Services.IAxeService;
import com.example.audit.models.Axe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/axes")
//@AllArgsConstructor
public class AxeController {
    @Autowired
    private IAxeService axeService;



    @GetMapping
    public ResponseEntity<List<Axe>> getAllAxes() {
        List<Axe> axes = axeService.getAllAxes();
        return ResponseEntity.ok(axes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Axe> getAxeById(@PathVariable Long id) {
        Axe axe = axeService.getAxeById(id);
        if (axe == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(axe);
    }

    @PostMapping
    public ResponseEntity<Axe> createAxe(@RequestBody Axe axe) {
        Axe savedAxe = axeService.saveAxe(axe);
        return ResponseEntity.ok(savedAxe);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAxe(@PathVariable Long id) {
        axeService.deleteAxe(id);
        return ResponseEntity.noContent().build();
    }
}
