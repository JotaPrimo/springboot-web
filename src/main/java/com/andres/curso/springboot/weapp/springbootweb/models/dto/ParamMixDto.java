package com.andres.curso.springboot.weapp.springbootweb.models.dto;

public class ParamMixDto {
    private String message;
    private Integer code;

    public ParamMixDto() {
    }

    public ParamMixDto(String messagem, Integer code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
