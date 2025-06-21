package com.dati.mapper;

import com.dati.pojo.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IQuizMapper {
    List<Question> queryQuestions();
}
