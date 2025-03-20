package com.capgemini.question_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;

    public String getQuestionTitle() {
        return questionTitle;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption1() {
        return option1;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public String getCategory() {
        return category;
    }

    public Integer getId() {
        return id;
    }

    public String getOption3() {
        return option3;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getOption4() {
        return option4;
    }
}
