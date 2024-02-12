package com.andres.curso.springboot.weapp.springbootweb.web.controllers;

import com.andres.curso.springboot.weapp.springbootweb.config.ApiPath;
import com.andres.curso.springboot.weapp.springbootweb.models.dto.ParamDto;
import com.andres.curso.springboot.weapp.springbootweb.models.dto.ParamMixDto;
import jakarta.servlet.http.HttpServletRequest;
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

    @GetMapping
    public ParamDto bar(@RequestParam String text, @RequestParam Integer code) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(text);
        return paramDto;
    }

    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) {
        ParamMixDto paramDto = new ParamMixDto();
        paramDto.setMessage(request.getParameter("text"));
        paramDto.setCode(Integer.parseInt(request.getParameter("code")));
        return paramDto;
    }
}
