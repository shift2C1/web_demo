package com.eg.test.mapper;

import com.eg.test.entity.Test;
import com.eg.test.entity.TestExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
    int countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int deleteByPrimaryKey(String testId);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);

    Test selectByPrimaryKey(String testId);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}