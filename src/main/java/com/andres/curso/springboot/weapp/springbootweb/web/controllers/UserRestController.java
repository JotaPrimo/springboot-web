package com.andres.curso.springboot.weapp.springbootweb.web.controllers;

import com.andres.curso.springboot.weapp.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details")
    @ResponseBody // indica que o retorno será em json, o @REstController combina @ResponseBody com @Controller
    public User details() {
        User user = new User("Jota", "Santos");
        Map<String, Object> body = new HashMap<>();

        body.put("titulo", "View details");
        // body.put("nome", "Jota Santos");
        body.put("user", user);
        return user;
    }

}
