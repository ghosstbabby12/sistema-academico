package com.camila.sistema_academico.controller;

import com.camila.sistema_academico.model.Estudiante;
import com.camila.sistema_academico.service.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
@RequiredArgsConstructor
public class EstudianteController {

    private final EstudianteService service;

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante e) {
        return service.guardar(e);
    }

    @GetMapping
    public List<Estudiante> listar() {
        return service.listar();
    }
}
