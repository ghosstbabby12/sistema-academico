package com.camila.sistema_academico.model;

import com.camila.sistema_academico.interfaces.Autenticable;
import com.camila.sistema_academico.interfaces.Evaluador;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profesor extends Persona implements Evaluador, Autenticable {

    private String especialidad;

    @Override
    public void evaluarEstudiante(String estudiante, String trabajo) {
        System.out.println("Evaluando estudiante: " + estudiante + " - Trabajo: " + trabajo);
    }

    @Override
    public boolean login(String usuario, String password) {
        return true;
    }
}
