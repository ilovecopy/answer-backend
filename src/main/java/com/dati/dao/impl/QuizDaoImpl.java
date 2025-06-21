package com.dati.dao.impl;

import com.dati.dao.IQuizDao;
import com.dati.mapper.IQuizMapper;
import com.dati.pojo.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class QuizDaoImpl implements IQuizDao {
    @Autowired
    private IQuizMapper quizMapper;
    @Override
    public List<Question> queryQuestions() {
        return quizMapper.queryQuestions();
    }
}
