package com.andres.curso.springboot.weapp.springbootweb.web.controllers;

import com.andres.curso.springboot.weapp.springbootweb.models.User;
import com.andres.curso.springboot.weapp.springbootweb.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller // para espeficicar que é um controlador, é também um componente
public class UserController {

    // processa request e retorna resposta

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Jota", "Santos");
        user.setName("View details");
        user.setLastname("Jota Santos");
        user.setEmail("gestald118@gmail.com");

        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap modelMap) {
        List<User> list = new ArrayList<>();
        list = UserService.getList();

        modelMap.addAttribute("users", list);
        modelMap.addAttribute("title", "Listado de usuarios");

        return "users/list";
    }

}
