package com.example.audit.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.audit.models.Questions;

public interface QuestionsRepository extends JpaRepository<Questions, Long> {

}

