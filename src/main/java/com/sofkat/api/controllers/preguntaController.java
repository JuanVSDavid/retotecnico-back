package com.sofkat.api.controllers;

import java.util.List;

import com.sofkat.api.models.pregunta;
import com.sofkat.api.repositories.preguntaRepository;
import com.sofkat.api.services.preguntaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class preguntaController {

    @Autowired
    @Qualifier("preguntaService")
    private preguntaService ps;

    @Autowired
    @Qualifier("preguntaRepository")
    private preguntaRepository pr;

    @GetMapping("/listPreguntas")
    public List<pregunta> listPreguntas() {
        return ps.getPreguntas();
    }

    @PostMapping("/savePregunta")
    public pregunta savePregunta(@RequestBody pregunta p){
        pregunta pn = pr.save(p);
        pn.getOptions().setId_pregunta(pn);
        return pr.save(pn);
    }
}
