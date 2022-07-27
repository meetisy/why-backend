//package com.example.whybackend.controller;
//
//import com.example.whybackend.service.impl.HotQuestionImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.util.List;
//@RestController
//public class UserController {
//    @Autowired
//    private HotQuestionImpl hotQuestionService;
//    @ResponseBody
//    @CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
//    @RequestMapping(value = "get_hot_question_list", method = RequestMethod.GET)
//    public Object loginStatus() {
//        List res = hotQuestionService.getHotQuestionList();
//        return res;
//    }
//}
