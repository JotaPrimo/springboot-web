package com.andres.curso.springboot.weapp.springbootweb.web.controllers;

import com.andres.curso.springboot.weapp.springbootweb.models.User;
import com.andres.curso.springboot.weapp.springbootweb.models.dto.UserDto;
import com.andres.curso.springboot.weapp.springbootweb.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class UserRestController {
    public UserService userService = new UserService();

    @GetMapping("/details")
    @ResponseBody // indica que o retorno será em json, o @REstController combina @ResponseBody com @Controller
    public UserDto details() {
        UserDto userDto = new UserDto();

        User user = new User("Jota", "Santos");
        userDto.setUser(user);
        userDto.setTitle("Hola mundo spring");

        return userDto;
    }

    @GetMapping("/details-map")
    @ResponseBody // indica que o retorno será em json, o @REstController combina @ResponseBody com @Controller
    public Map<String, Object> detailsMap() {
        User user = new User("Jota", "Santos");
        Map<String, Object> body = new HashMap<>();

        body.put("titulo", "View details");
        body.put("nome", "Jota Santos");
        body.put("user", user);
        return body;
    }

    @GetMapping("/list")
    @ResponseBody
    public List<User> list() {
        return UserService.getList();
    }

}
