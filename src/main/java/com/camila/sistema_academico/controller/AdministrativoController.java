package com.camila.sistema_academico.controller;

import com.camila.sistema_academico.model.Administrativo;
import com.camila.sistema_academico.service.AdministrativoService;
import com.camila.sistema_academico.service.NotificacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/administrativos")
@RequiredArgsConstructor
public class AdministrativoController {

    private final AdministrativoService service;
    private final NotificacionService notificacionService;

    @PostMapping
    public Administrativo crear(@RequestBody Administrativo a) {
        return service.guardar(a);
    }

    @GetMapping
    public List<Administrativo> listar() {
        return service.listar();
    }

    @PostMapping("/{id}/notificar")
    public Map<String, String> notificar(@PathVariable Long id, @RequestBody Map<String, String> body) {
        Administrativo admin = service.listar().stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Administrativo no encontrado"));

        String mensaje = body.getOrDefault("mensaje", "Notificación del sistema académico");
        admin.enviarNotificacion(mensaje);
        notificacionService.enviar(admin.getCorreo(), mensaje);

        return Map.of("status", "Notificación enviada a " + admin.getCorreo());
    }
}
