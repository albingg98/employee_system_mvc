# Sistema de Gestión de Empleados - MVC
Aplicación web desarrollada con Spring Boot que implementa el patrón Modelo-Vista-Controlador (MVC), Programación Orientada a Aspectos (AOP) y utiliza Thymeleaf para la generación de vistas dinámicas. Permite el registro, gestión, validación y seguimiento de empleados, ofreciendo una interfaz intuitiva y funcionalidades robustas para la administración de personal. Proporciona funcionalidades completas de CRUD (Crear, Leer, Actualizar, Eliminar) y está desplegado en la plataforma Render.

## 🌐 Demo en Vivo
Accede a la aplicación aquí: employee-system-mvc.onrender.com

## 🧩 Características Principales
Registro y gestión de empleados: Añade, edita y elimina información de empleados.
 - Agregar Nuevo Empleado: Formulario para añadir nuevos empleados con validaciones integradas.
 - Editar Información: Modifica los datos de un empleado existente.
 - Eliminar Empleado: Elimina registros de empleados de manera segura.

Validación de formularios: Asegura la integridad de los datos ingresados.

Vistas dinámicas con Thymeleaf: Interfaz de usuario interactiva y amigable.

Programación Orientada a Aspectos (AOP): Manejo de registros y seguimiento de acciones.

Persistencia de datos: Integración con bases de datos para almacenamiento confiable.

Contenedorización con Docker: Facilita el despliegue y la ejecución en diferentes entornos.

## 🛠️ Tecnologías Utilizadas
🔧 Frameworks y Librerías
Spring Boot – Framework principal para el desarrollo de la aplicación backend.

Thymeleaf – Motor de plantillas para generar vistas HTML dinámicas.

💻 Lenguajes
Java – Lenguaje principal de programación.

HTML – Estructura de las vistas web.

📦 Gestión de Dependencias
Maven – Herramienta para la construcción y gestión de dependencias del proyecto.

🐳 Contenedorización
Docker – Facilita la construcción, envío y ejecución de la aplicación en contenedores.

🗄️ Base de Datos
MySQL – Sistema de gestión de bases de datos relacional utilizado para almacenar la información de empleados.

☁️ Despliegue
Render – Plataforma utilizada para el despliegue automático y escalable de la aplicación en la nube.

Requisitos Previos
Java 11 o superior

Maven 3.6 o superior

Docker (opcional, para ejecución en contenedor)

Instalación y Ejecución
Clonar el Repositorio
bash
Copiar
Editar
git clone https://github.com/albingg98/employee_system_mvc.git
cd employee_system_mvc
Construir el Proyecto
bash
Copiar
Editar
./mvnw clean install
Ejecutar la Aplicación
bash
Copiar
Editar
./mvnw spring-boot:run
La aplicación estará disponible en http://localhost:8080.

Uso de Docker (Opcional)
Para construir y ejecutar la aplicación en un contenedor Docker:

bash
Copiar
Editar
docker build -t employee_system_mvc .
docker run -p 8080:8080 employee_system_mvc
Estructura del Proyecto
src/: Código fuente de la aplicación.

sql-scripts/: Scripts SQL para la configuración de la base de datos.

Dockerfile: Configuración para la creación de la imagen Docker.

pom.xml: Archivo de configuración de Maven con las dependencias necesarias.
