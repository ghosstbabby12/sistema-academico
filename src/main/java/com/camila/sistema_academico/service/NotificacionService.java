package com.camila.sistema_academico.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificacionService {

    private final JavaMailSender mailSender;

    public void enviar(String destinatario, String mensaje) {
        // Siempre muestra en terminal
        System.out.println("=================================");
        System.out.println("NOTIFICACION ENVIADA");
        System.out.println("Para: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("=================================");

        // Envía correo real
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(destinatario);
        mail.setSubject("Notificación - Sistema Académico");
        mail.setText(mensaje);
        mailSender.send(mail);
    }
}
