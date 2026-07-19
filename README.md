# Llanquihue Tour - Sistema de Gestión Turística

## Descripción general del sistema

Llanquihue Tour es un prototipo desarrollado en **Java** utilizando los principios de la **Programación Orientada a Objetos (POO)**. Su objetivo es mejorar la gestión de una empresa de turismo mediante la administración de clientes, guías, proveedores, tours, itinerarios y reservas.

El sistema busca solucionar problemas como la duplicación de información, la gestión manual de reservas y la falta de organización de los datos, proporcionando una estructura modular y reutilizable.

---

## Funcionalidades principales

- Registro de clientes.
- Administración de guías y proveedores.
- Creación y gestión de tours.
- Gestión de actividades e itinerarios.
- Registro de reservas.
- Carga de datos desde archivos `.txt`.
- Validación de RUT mediante excepciones personalizadas.
- Uso de colecciones (`ArrayList`, `HashMap` y `Stack`).

---

# Estructura del proyecto

```
LlanquihueTour
│
├── app
│   └── Main.java
│
├── model
│   ├── Persona.java
│   ├── Cliente.java
│   ├── Empleado.java
│   ├── Guia.java
│   ├── Proveedor.java
│   ├── Direccion.java
│   ├── Rut.java
│   ├── Tarjeta.java
│   ├── Producto.java
│   ├── OrdenDeCompra.java
│   ├── Actividad.java
│   ├── Itinerario.java
│   ├── Tour.java
│   └── Reserva.java
│
├── data
│   ├── BaseDatos.java
│   ├── ArchivoUtil.java
│   ├── ClienteDAO.java
│   └── TourDAO.java
│
├── interfaces
│   └── Registrable.java
│
├── utils
│   ├── RutInvalidoException.java
│   └── ValidadorRut.java
│
└── recursos
    ├── clientes.txt
    └── tours.txt
```

---

# Resumen de las clases principales

| Clase | Función |
|--------|---------|
| **Main** | Punto de entrada del sistema y menú principal. |
| **Persona** | Clase base para representar personas del sistema. |
| **Cliente** | Representa a un cliente que puede realizar reservas. |
| **Empleado** | Representa un empleado de la empresa. |
| **Guia** | Representa un guía turístico. |
| **Proveedor** | Representa un proveedor de servicios turísticos. |
| **Direccion** | Almacena la dirección de una persona. |
| **Rut** | Representa el RUT con validación mediante excepción personalizada. |
| **Tarjeta** | Información de pago del cliente. |
| **Producto** | Representa un producto o servicio turístico. |
| **OrdenDeCompra** | Gestiona productos asociados a una compra. |
| **Actividad** | Representa una actividad dentro de un itinerario. |
| **Itinerario** | Contiene las actividades de un tour. |
| **Tour** | Representa un paquete turístico. |
| **Reserva** | Gestiona las reservas realizadas por los clientes. |
| **BaseDatos** | Almacena la información utilizando colecciones (`ArrayList`, `HashMap` y `Stack`). |
| **ArchivoUtil** | Lee archivos `.txt` y convierte los datos en objetos Java. |
| **ClienteDAO** | Gestiona las operaciones relacionadas con clientes. |
| **TourDAO** | Gestiona las operaciones relacionadas con tours. |
| **Registrable** | Interfaz implementada por las clases que pueden registrarse y mostrar información. |
| **RutInvalidoException** | Excepción personalizada para validar RUT. |
| **ValidadorRut** | Contiene la lógica de validación del RUT. |

---

# Principios de Programación Orientada a Objetos aplicados

- Encapsulamiento.
- Herencia.
- Polimorfismo.
- Composición.
- Sobrecarga de métodos.
- Sobrescritura (`@Override`).
- Interfaces.
- Manejo de excepciones personalizadas.

---

# Colecciones utilizadas

- **ArrayList**: almacenamiento de clientes, tours, reservas, productos y actividades.
- **HashMap**: búsqueda rápida de clientes y tours.
- **Stack**: historial de reservas realizadas.

---

# Requisitos

- Java JDK 17 o superior.
- IntelliJ IDEA (o cualquier IDE compatible con Java).

---

# Instrucciones para clonar el proyecto

1. Abrir una terminal.
2. Ejecutar el siguiente comando (reemplaza la URL por la de tu repositorio):

```bash
git clone https://github.com/USUARIO/LlanquihueTour.git
```

3. Entrar al proyecto:

```bash
cd LlanquihueTour
```

4. Abrir el proyecto en IntelliJ IDEA.

5. Verificar que la carpeta **recursos** contenga los archivos:

- clientes.txt
- tours.txt

6. Ejecutar la clase:

```
app/Main.java
```

---

# Ejemplo del menú principal

```
==============================
      LLANQUIHUE TOUR
==============================

1. Registrar cliente
2. Mostrar clientes
3. Crear tour
4. Mostrar tours
5. Crear reserva
6. Mostrar reservas
7. Mostrar registros polimórficos
8. Salir
```

---

# Mejoras futuras

- Integración con base de datos MySQL.
- Interfaz gráfica con JavaFX.
- Inicio de sesión para usuarios.
- Generación de reportes.
- Integración con plataformas de pago.

---

