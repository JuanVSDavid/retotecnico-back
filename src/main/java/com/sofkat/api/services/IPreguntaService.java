package com.sofkat.api.services;

import java.util.ArrayList;
import java.util.List;

import com.sofkat.api.models.pregunta;
import com.sofkat.api.repositories.preguntaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("preguntaService")
public class IPreguntaService implements preguntaService {

    @Autowired
    @Qualifier("preguntaRepository")
    private preguntaRepository pr;
    

    @Override
    public List<pregunta> getPreguntas() {
        List<pregunta> list = new ArrayList<pregunta>();
        String[] level = {"facil", "normal", "intermedio", "dificil", "super"};
        for (int i = 0; i < 5; i++) {
            list.add(pr.getQuestion(level[i]));
        }
        return list;
    }
    
}
