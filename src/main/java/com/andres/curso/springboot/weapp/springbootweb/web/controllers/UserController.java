package com.andres.curso.springboot.weapp.springbootweb.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller // para espeficicar que é um controlador, é também um componente
public class UserController {
    // processa request e retorna resposta

    @GetMapping("/details")
    public String details(Model model) {
        // as views devem exisir em templates
        // devo retornar o nome da view, não precisa da extensão
        // passando parametros para a view
        model.addAttribute("titulo", "View details");
        model.addAttribute("nome", "Jota Santos");
        model.addAttribute("message", "Bem vindo");
        return "details";
    }

    @GetMapping("/teste")
    public String teste() {
        return "users/details";
    }

}
