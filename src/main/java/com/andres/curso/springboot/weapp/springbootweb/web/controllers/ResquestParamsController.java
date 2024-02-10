package com.andres.curso.springboot.weapp.springbootweb.web.controllers;

import com.andres.curso.springboot.weapp.springbootweb.config.ApiPath;
import com.andres.curso.springboot.weapp.springbootweb.models.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPath.REQUEST_PARAMS)
public class ResquestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Obrigado Senhor meu Deus") String message) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        return paramDto;
    }
}
