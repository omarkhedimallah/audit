package com.example.audit.Repositories;

import com.example.audit.models.Axe;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.audit.models.Domains;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DomainsRepository extends JpaRepository<Domains, Long> {
  List<Domains> findDomainsByAxe_Id(Long idAxe);
}
