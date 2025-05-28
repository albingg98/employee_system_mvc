# Sistema de Gestión de Empleados (MVC)

Aplicación web desarrollada con Spring Boot que implementa el patrón Modelo-Vista-Controlador (MVC), con Thymeleaf para las vistas y MySQL como base de datos. Incluye características para gestionar empleados y está preparada para ejecutarse localmente o en Docker.

---

## 🛠️ Tecnologías Utilizadas

- **Framework:** Spring Boot  
- **Lenguajes:** Java, HTML  
- **Motor de plantillas:** Thymeleaf  
- **Gestión de dependencias:** Maven  
- **Base de datos:** MySQL  
- **Contenedorización:** Docker  
- **Despliegue:** Render  

---

## 🧩 Características Principales

- **Registro y gestión de empleados**  
  - Agregar nuevo empleado: Formulario con validaciones para añadir empleados.  
  - Editar información: Modificar datos de empleados existentes.  
  - Eliminar empleado: Eliminar registros de forma segura.  

- **Validación de formularios**: Garantiza que los datos ingresados sean correctos.  
- **Vistas dinámicas con Thymeleaf**: Interfaz amigable e interactiva.  
- **Programación Orientada a Aspectos (AOP)**: Seguimiento y manejo de registros.  
- **Persistencia de datos**: Uso de MySQL para almacenamiento confiable.  
- **Contenedorización con Docker**: Facilita despliegue y portabilidad.  

---

## 🚀 Instalación y Ejecución

**Clonar el repositorio**:

Clona el proyecto desde GitHub y accede a la carpeta del proyecto.

```bash
git clone https://github.com/albingg98/employee_system_mvc.git
cd employee_system_mvc
```

**Construir el proyecto**:

Compila y empaqueta el proyecto con Maven.

```bash
./mvnw clean install
```

**Ejecutar la aplicación**:

Inicia la aplicación Spring Boot localmente.

```bash
./mvnw spring-boot:run
```
La aplicación estará disponible en http://localhost:8080.

🐳 **Uso de Docker (Opcional)**:

Construir la imagen Docker
Construye la imagen Docker del proyecto.

```bash
docker build -t employee_system_mvc .
```

**Ejecutar el contenedor**:

Levanta un contenedor y expone el puerto 8080.

```bash
docker run -p 8080:8080 employee_system_mvc
```

Asegúrate de configurar las variables de entorno necesarias para la conexión a la base de datos MySQL si usas un servicio externo.
