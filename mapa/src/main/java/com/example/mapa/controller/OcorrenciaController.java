package com.example.mapa.controller;

import com.example.mapa.repository.OcorrenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/ocorrencias")
@CrossOrigin("*")
public class OcorrenciaController {

    @Autowired
    private OcorrenciaRepository repo;

    @PostMapping
    public Ocorrencia criar(@RequestBody Ocorrencia o) {
        o.setData(LocalDateTime.now());
        return repo.save(o);
    }

    @GetMapping
    public List<Ocorrencia> listar() {
        return repo.findAll();
    }
}
