package com.dati.pojo;

import lombok.Data;

@Data
public class Question {
    private Long id;
    /**
     * 题目
     */
    private String title;
    /**
     * 选项A
     */
    private String optionA;
    /**
     * 选项B
     */
    private String optionB;
    /**
     * 选项C
     */
    private String optionC;
    /**
     * 选项D
     */
    private String optionD;
    /**
     * 题目类型
     */
    private String type;
    /**
     * 答案
     */
    private int answer;
    /**
     * 解析
     */
    private String exp;


}
