package com.camila.sistema_academico.service;

import com.camila.sistema_academico.model.Profesor;
import com.camila.sistema_academico.repository.ProfesorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfesorService {

    private final ProfesorRepository repository;

    public Profesor guardar(Profesor p) {
        return repository.save(p);
    }

    public List<Profesor> listar() {
        return repository.findAll();
    }
}
