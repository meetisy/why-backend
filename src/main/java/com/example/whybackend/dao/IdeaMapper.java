package com.example.whybackend.dao;

import com.example.whybackend.HotQuestion;
import com.example.whybackend.Idea;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdeaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table idea
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table idea
     *
     * @mbg.generated
     */
    int insert(Idea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table idea
     *
     * @mbg.generated
     */
    int insertSelective(Idea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table idea
     *
     * @mbg.generated
     */
    Idea selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table idea
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Idea record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table idea
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Idea record);

    List<Idea> getIdeaList();
}