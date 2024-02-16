package com.andres.curso.springboot.weapp.springbootweb.web.controllers;

import com.andres.curso.springboot.weapp.springbootweb.config.ApiPath;
import com.andres.curso.springboot.weapp.springbootweb.models.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(ApiPath.PATH_VARIABLE)
public class PathVariableController {

    @GetMapping("/{message}")
    public ParamDto baz(@PathVariable(required = false, value = "Hola mi amor Jessica Helena") String message) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        return paramDto;
    }

    @GetMapping("/mix/{produto}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String produto, @PathVariable Long id) {
        Map<String, Object> json = new HashMap<>();
        json.put("produto", produto);
        json.put("id", id);

        return json;
    }

}
