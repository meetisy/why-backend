package com.example.whybackend.service.impl;

import com.example.whybackend.HotQuestion;
import com.example.whybackend.Idea;
import com.example.whybackend.dao.HotQuestionMapper;
import com.example.whybackend.dao.IdeaMapper;
import com.example.whybackend.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdeaImpl implements IdeaService {
    @Autowired
    private IdeaMapper ideaMapper;

    @Override
    public List<Idea> getIdeaList() {
        return ideaMapper.getIdeaList();
    }
}
