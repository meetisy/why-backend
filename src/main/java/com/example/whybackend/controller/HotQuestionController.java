package com.example.whybackend.controller;

import com.example.whybackend.service.impl.HotQuestionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class HotQuestionController {
    @Autowired
    private HotQuestionImpl hotQuestionService;
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
    @RequestMapping(value = "get_hot_question_list", method = RequestMethod.GET)
    public Object getHotQuestionList() {
        List res = hotQuestionService.getHotQuestionList();
        return res;
    }
}
