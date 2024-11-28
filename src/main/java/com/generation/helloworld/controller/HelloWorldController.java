package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public List<String> bsmList() {
        return List.of(
                "Responsabilidade Pessoal",
                "Mentalidade de Crescimento",
                "Orientação ao Futuro",
                "Persistência",
                "Trabalho em Equipe",
                "Proatividade",
                "Comunicação",
                "Orientação ao Detalhe"
        );
    }

    @GetMapping("/objetivos")
    public List<String> objetivosAprendizado() {
        return List.of(
                "Aprimorar conhecimento em Spring Boot",
                "Praticar mais"
        );
    }
}