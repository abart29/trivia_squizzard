package com.ctrlaltcomplete.trivia.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameQuestionTests {

    private static GameQuestion testGameQuestion;

    @BeforeEach
    public void setUp() {
        testGameQuestion = new GameQuestion();
        testGameQuestion.setUser(new User());
        testGameQuestion.setDifficulty("Medium");
        testGameQuestion.setCorrectAnswer("Dough");
        testGameQuestion.setIsCorrect(Boolean.TRUE);
        testGameQuestion.setScore(2L);
    }

    @Test
    public void GameQuestionCreated() {
        assertEquals(testGameQuestion.getDifficulty(), "Medium");
        assertEquals(testGameQuestion.getCorrectAnswer(), "Dough");
        assertEquals(testGameQuestion.getIsCorrect(), Boolean.TRUE);
        assertEquals(testGameQuestion.getScore(),2L);
    }

    @Test
    public void GameQuestionsExampled() {
        GameQuestion testGameQuestion2 = new GameQuestion("Dough", "Dough", Boolean.TRUE, "Medium", 2L);

        assertEquals(testGameQuestion2.getCorrectAnswer(), "Dough");
        assertEquals(testGameQuestion2.getDifficulty(), "Medium");
        assertEquals(testGameQuestion2.getIsCorrect(), Boolean.TRUE);
        assertEquals(testGameQuestion2.getScore(),2L);




    }


}
