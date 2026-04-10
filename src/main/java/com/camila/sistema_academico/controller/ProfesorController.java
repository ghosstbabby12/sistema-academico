package com.camila.sistema_academico.controller;

import com.camila.sistema_academico.model.Profesor;
import com.camila.sistema_academico.service.ProfesorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores")
@RequiredArgsConstructor
public class ProfesorController {

    private final ProfesorService service;

    @PostMapping
    public Profesor crear(@RequestBody Profesor p) {
        return service.guardar(p);
    }

    @GetMapping
    public List<Profesor> listar() {
        return service.listar();
    }
}
