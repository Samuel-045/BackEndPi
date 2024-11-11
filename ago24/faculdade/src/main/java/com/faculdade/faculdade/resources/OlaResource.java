package com.faculdade.faculdade.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OlaResource {
    @RequestMapping(value = "/")
    @ResponseBody
    public String ola(){
        return "Aplicação atualizada 09/09/2024";
    }
}
