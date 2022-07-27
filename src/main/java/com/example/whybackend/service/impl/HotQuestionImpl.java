package com.example.whybackend.service.impl;

import com.example.whybackend.HotQuestion;
import com.example.whybackend.dao.HotQuestionMapper;
import com.example.whybackend.service.HotQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotQuestionImpl implements HotQuestionService {
    @Autowired
    private HotQuestionMapper hotQuestionMapper;

    @Override
    public List<HotQuestion> getHotQuestionList() {
        return hotQuestionMapper.getHotQuestionList();
    }
}
