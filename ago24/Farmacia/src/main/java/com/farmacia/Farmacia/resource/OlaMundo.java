package com.farmacia.Farmacia.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OlaMundo {
    @RequestMapping("/")
    @ResponseBody
    public String olaMundo() {
        return "Projeto da Farmacia";
    }
}