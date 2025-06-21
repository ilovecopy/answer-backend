package com.dati.dao;

import com.dati.pojo.Question;

import java.util.List;


public interface IQuizDao {
    List<Question> queryQuestions();
}
