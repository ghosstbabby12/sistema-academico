package com.camila.sistema_academico.model;

import com.camila.sistema_academico.interfaces.Aprobador;
import com.camila.sistema_academico.interfaces.Notificable;
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
public class Administrativo extends Persona implements Aprobador, Notificable {

    private String area;

    @Override
    public void aprobarSolicitud(String codigoSolicitud) {
        System.out.println("Solicitud aprobada: " + codigoSolicitud);
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificación enviada: " + mensaje);
    }
}
