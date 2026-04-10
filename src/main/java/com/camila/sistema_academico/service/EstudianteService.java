package com.camila.sistema_academico.service;

import com.camila.sistema_academico.model.Estudiante;
import com.camila.sistema_academico.repository.EstudianteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstudianteService {

    private final EstudianteRepository repository;

    public Estudiante guardar(Estudiante e) {
        return repository.save(e);
    }

    public List<Estudiante> listar() {
        return repository.findAll();
    }
}
