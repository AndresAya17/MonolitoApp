
# 📦 Product API with Authentication & Authorization

![Java](https://img.shields.io/badge/Java-17-blue.svg) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7-green.svg) ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-14-blue.svg) ![Maven](https://img.shields.io/badge/Maven-3.8.6-C71A36.svg) ![Docker](https://img.shields.io/badge/Docker-20.10-blue.svg)

## 🛠️ Proyecto en Java

Este proyecto está desarrollado en **Java** utilizando **Spring Boot** para proporcionar una API segura y funcional con las siguientes características principales:

- **Autenticación** mediante tokens JWT.
- **Autorización** basada en roles (`ADMIN`, `USER`).
- API REST para gestión de productos (CRUD).
  
## 🚀 Funcionalidades

### 🔐 Autenticación y Autorización
- **Registro y Login**: Los usuarios pueden registrarse y autenticarse para recibir un token JWT.
- **Roles de usuario**: Diferenciación entre usuarios con permisos de `ADMIN` y `USER`.
- **Protección de rutas**: Algunas rutas están restringidas solo para usuarios con roles específicos.

### 📦 API de Productos
- **Crear, Leer, Actualizar y Eliminar productos**.
- Rutas para gestionar productos con autenticación requerida.

## 📚 Tecnologías Utilizadas
- **Java 17**
- **Spring Boot 2.7**
- **JWT** para autenticación y autorización
- **PostgreSQL** como base de datos
- **Maven** para gestión de dependencias
- **Docker** para contenerización de la base de datos
