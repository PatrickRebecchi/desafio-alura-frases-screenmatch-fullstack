package br.com.alura.desafio.screenMatch.controller;

import br.com.alura.desafio.screenMatch.dto.FraseDTO;
import br.com.alura.desafio.screenMatch.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {
    @Autowired
    private FraseService service;


    @GetMapping("/frases")
    public FraseDTO obterFrase(){
        return service.obterFrases();
    }
}
