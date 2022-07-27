//package com.example.whybackend.controller;
//
//import com.example.whybackend.common.ErrorMessage;
//import com.example.whybackend.common.SuccessMessage;
//import com.example.whybackend.service.impl.UserServiceImpl;
//import org.apache.ibatis.jdbc.Null;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.util.logging.Logger;
//@RestController
//public class UserController {
//    @Autowired
//    private UserServiceImpl userService;
//    static String strClassName = UserController.class.getName();
//    static Logger logger = Logger.getLogger(strClassName);
//    // 判断是否登录成功
//    @ResponseBody
//    @CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
//    @RequestMapping(value = "user/login/status", method = RequestMethod.POST)
//    public Object loginStatus(HttpServletRequest req, HttpSession session) {
//        String name = req.getParameter("username");
//        String password = req.getParameter("password");
//        boolean res = userService.verifyPassword(name, password);
//        if (res) {
//            session.setAttribute("name", name);
//            return new SuccessMessage<Null>("登录成功").getMessage();
//        } else {
//            return new ErrorMessage("用户名或密码错误").getMessage();
//        }
//    }
//}
