package com.example.audit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.audit.models.Axe;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface AxeRepository extends JpaRepository<Axe,Long> {
    @Query("SELECT a FROM Axe a JOIN a.missions m WHERE m.id = :missionId")
    List<Axe> findAxesByMissionId(@Param("missionId") Long missionId);
}