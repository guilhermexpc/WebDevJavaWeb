package com.example.springbootaula3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Diz que a classe é do tipo Controller, Controladora.
public class MeuControlador {

    @RequestMapping("/home") // Responde pela rota HomeJava
    @ResponseBody // Responde no formato de página
    public String home() {
        return "Home Route...";
    }

    @RequestMapping("/formcad") // Responde pela rota Form
    public String formCad() {
        return "formCad";
    }

}
