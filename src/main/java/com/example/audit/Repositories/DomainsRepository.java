package com.example.audit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.audit.models.Domains;

public interface DomainsRepository extends JpaRepository<Domains, Long> {

}
