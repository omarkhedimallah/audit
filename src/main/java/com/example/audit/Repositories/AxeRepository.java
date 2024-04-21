package com.example.audit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.audit.models.Axe;
import org.springframework.stereotype.Repository;

@Repository
public interface AxeRepository extends JpaRepository<Axe,Long> {

}