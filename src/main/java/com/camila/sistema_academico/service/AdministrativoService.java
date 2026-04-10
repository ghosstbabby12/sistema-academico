package com.camila.sistema_academico.service;

import com.camila.sistema_academico.model.Administrativo;
import com.camila.sistema_academico.repository.AdministrativoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdministrativoService {

    private final AdministrativoRepository repository;

    public Administrativo guardar(Administrativo a) {
        return repository.save(a);
    }

    public List<Administrativo> listar() {
        return repository.findAll();
    }
}
