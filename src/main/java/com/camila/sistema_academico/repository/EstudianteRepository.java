package com.camila.sistema_academico.repository;

import com.camila.sistema_academico.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
