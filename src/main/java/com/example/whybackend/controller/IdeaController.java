package com.example.whybackend.controller;

import com.example.whybackend.Idea;
import com.example.whybackend.service.impl.IdeaImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class IdeaController {
    @Autowired
    private IdeaImpl ideaService;
    @ResponseBody
    @CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
    @RequestMapping(value = "get_idea_list", method = RequestMethod.GET)
    public Object getIdeaList() {
        List<Idea> res = ideaService.getIdeaList();
        return res;
    }
}
