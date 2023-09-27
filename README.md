# Proyecto Spring Boot de Gestión de Cursos

Este es un proyecto de ejemplo que utiliza Spring para gestionar una lista de libros.

## Descripción

El objetivo de este proyecto es mostrar cómo crear una aplicación web simple utilizando Spring Framework para realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) en una lista de libros. La aplicación incluye un controlador REST, un servicio y una clase de modelo para gestionar los libros.

## Prerrequisitos

Antes de comenzar, asegúrate de tener instalado lo siguiente en tu entorno de desarrollo:

- **Java**: Asegúrate de tener Java JDK 8 o una versión posterior instalada en tu sistema.
- **Maven**: Debes tener Maven instalado para compilar y construir el proyecto.
- **Git**: Si no tienes Git instalado, puedes descargarlo [aquí](https://git-scm.com/downloads).

## Clonar el Repositorio

Primero, clona este repositorio en tu máquina local usando el siguiente comando de Git:

```bash
git clone https://github.com/TuUsuario/tu-proyecto.git
```

Reemplaza TuUsuario y tu-proyecto con tu nombre de usuario y el nombre del repositorio, respectivamente.

## Configuración del Proyecto

Abre una terminal y navega hasta la raíz del proyecto clonado:

```bash
cd tu-proyecto
```

Asegúrate de que tengas Maven instalado y ejecuta el siguiente comando para compilar y construir el proyecto:

```bash
mvn clean install
```

Esto descargará las dependencias necesarias y generará el archivo JAR ejecutable del proyecto.

## Ejecutar la Aplicación

Abre el proyecto en tu IDE de desarrollo preferido y ejecuta la aplicación Spring Boot desde tu IDE o utilizando Maven:

```bash
mvn spring-boot:run
```

La aplicación se ejecutará en el puerto predeterminado 8080.


# Uso de la API

Puedes utilizar la herramienta Postman para interactuar fácilmente con la API de gestión de cursos. A continuación, se detallan los pasos para realizar diferentes operaciones utilizando Postman.

## Configurar el Entorno de Postman

Descarga e instala [Postman](https://www.postman.com/downloads/), si aún no lo tienes instalado.

Abre Postman y crea un nuevo entorno llamado "API de Cursos". Esto te permitirá configurar y guardar las variables de entorno para las solicitudes.

Configura la variable de entorno "base_url" con el valor `http://localhost:8080`. Esto facilitará la configuración de las rutas en tus solicitudes.

## Crear un nuevo libro

Para crear un libro, realiza una solicitud POST a la siguiente URL:

- POST http://localhost:8080/book

Asegúrate de incluir un objeto JSON con los detalles del libro en el cuerpo de la solicitud. Por ejemplo:

```json
{
    "isbn": 666,
    "title": "Nuevo Libro",
    "genre": "Ficción"
}
```

## Búsqueda de un libro

Para buscar un libro por su ISBN, realiza una solicitud GET a la siguiente URL, proporcionando el ISBN del curso que deseas buscar:

- GET http://localhost:8080/book/1

## Actualización de un libro

Para actualizar un libro, realiza una solicitud PUT a la siguiente URL:
  
- PUT http://localhost:8080/course/1?duration=10

Asegúrate de incluir un objeto JSON con los nuevos detalles del libro en el cuerpo de la solicitud. Por ejemplo:

```json
{
    "isbn": 666,
    "title": "Nuevo Libro",
    "genre": "Ficción"
}
```

## Eliminación de un libro

Para eliminar un libro, realiza una solicitud DELETE a la siguiente URL, proporcionando el ISBN del libro que deseas eliminar:

- DELETE http://localhost:8080/book/1

# Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar este proyecto o informar sobre problemas, no dudes en crear un issue o enviar un pull request.