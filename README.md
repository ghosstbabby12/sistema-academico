# Sistema Académico

API REST desarrollada con Spring Boot que implementa herencia múltiple con las entidades Persona, Estudiante, Profesor y Administrativo.

Diagrama de clases en la wiki!

## Tecnologías
- Java 17
- Spring Boot
- Spring Data JPA
- H2 (base de datos en memoria)
- Lombok

## Cómo ejecutar

```bash
./mvnw spring-boot:run
```

## Autenticación

Todos los endpoints requieren **Basic Auth**:

| Campo | Valor |
|-------|-------|
| Username | `admin@sistema.com` |
| Password | `admin123` |

En Thunder Client: pestaña **Auth** → tipo **Basic** → ingresar las credenciales.

## Endpoints REST (Thunder Client / Postman)

### Estudiantes
| Método | URL |
|--------|-----|
| GET  | `http://localhost:8080/api/estudiantes` |
| POST | `http://localhost:8080/api/estudiantes` |

```json
{ "nombre": "Ana García", "correo": "ana@correo.com", "codigo": "EST-001" }
```

### Profesores
| Método | URL |
|--------|-----|
| GET  | `http://localhost:8080/api/profesores` |
| POST | `http://localhost:8080/api/profesores` |

```json
{ "nombre": "Carlos López", "correo": "carlos@correo.com", "especialidad": "Matemáticas" }
```

### Administrativos
| Método | URL |
|--------|-----|
| GET  | `http://localhost:8080/api/administrativos` |
| POST | `http://localhost:8080/api/administrativos` |

```json
{ "nombre": "María Torres", "correo": "maria@correo.com", "area": "Recursos Humanos" }
```

### Notificaciones
```
POST http://localhost:8080/api/administrativos/{id}/notificar

{ "mensaje": "Reunión programada para el lunes" }
```
