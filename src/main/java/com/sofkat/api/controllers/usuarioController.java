package com.sofkat.api.controllers;

import java.util.List;

import com.sofkat.api.models.score;
import com.sofkat.api.models.usuario;
import com.sofkat.api.repositories.scoreRepository;
import com.sofkat.api.repositories.usuarioRepository;

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
public class usuarioController {
    @Autowired
    @Qualifier("scoreRepository")
    private scoreRepository sr;

    @Autowired
    @Qualifier("usuarioRepository")
    private usuarioRepository ur;

    @GetMapping("/bestScore")
    private List<score> getBestScore(){
        return sr.queryScore();
    }

    @PostMapping("/uploadScore")
    private usuario uploadScore(@RequestBody usuario u){
        usuario un = ur.save(u);
        un.getScore().setUsuario(un);
        un.getScore().setName(un.getScore().getUsuario().getName());
        return ur.save(un);
    }
}
