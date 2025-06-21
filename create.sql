drop table question;
CREATE TABLE
    IF NOT EXISTS question (
                               id BIGINT NOT NULL PRIMARY KEY auto_increment COMMENT '自增主键',
                               title VARCHAR (500) NOT NULL COMMENT '题目',
                               option_a VARCHAR (500) COMMENT '选项A',
                               option_b VARCHAR (500) COMMENT '选项B',
                               option_c VARCHAR (500) COMMENT '选项C',
                               option_d VARCHAR (500) COMMENT '选项D',
                               answer VARCHAR (500) NOT NULL COMMENT '答案',
                               type VARCHAR (10) NOT NULL COMMENT '题目类型',
                               created_time TIMESTAMP NOT NULL DEFAULT now() COMMENT '创建时间',
                               updated_time TIMESTAMP ON UPDATE CURRENT_TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
);
