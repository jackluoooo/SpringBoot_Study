package com.ljx.springbootweb04.controller;

import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;


/**
 * @author：罗金星 date 2019/1/15 15:22
 **/
@Controller
public class LoginController {
    @PostMapping(value = "user/login")
    public String login(@RequestParam String username, @RequestParam String password, Map<String, Object> map,HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            session.setAttribute("loginuser",username);
            return "redirect:/main.html";
        } else {
            map.put("msg", "error");
            return "index";
        }

    }
}
