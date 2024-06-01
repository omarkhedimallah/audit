package com.example.audit.Services;



import com.example.audit.models.Questions;

import java.util.List;

public interface QuestionsServiceImp {
    List<Questions> getQuestionsByCriteria(Long idCriteria);
    List<Questions> getAllQuestions();

    Questions getQuestionById(Long id);

    Questions saveQuestion(Questions question);

    void deleteQuestion(Long id);
}
