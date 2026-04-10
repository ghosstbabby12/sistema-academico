package com.camila.sistema_academico.repository;

import com.camila.sistema_academico.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
