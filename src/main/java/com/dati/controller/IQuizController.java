package com.dati.controller;

import com.dati.dao.IQuizDao;
import com.dati.pojo.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin//允许跨域请求（开发阶段必须）
public class IQuizController {
    @Autowired
    private IQuizDao iQuizDao;

    @GetMapping("/question")
    public List<Question> getQuestion() {
        List<Question> questions = iQuizDao.queryQuestions();
        return questions;
    }
}
