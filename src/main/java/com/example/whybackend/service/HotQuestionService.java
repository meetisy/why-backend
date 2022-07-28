package com.example.whybackend.service;

import com.example.whybackend.HotQuestion;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface HotQuestionService {
    List<HotQuestion> getHotQuestionList();
}

//public interface UserService {
//    boolean verifyPassword(String name, String password);
//}
