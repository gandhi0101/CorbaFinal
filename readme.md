# Proyecto CORBA 

## Introducción

Este proyecto implementa un sistema distribuido utilizando CORBA en Java, desarrollado para la asignatura de REDES DE COMPUTADORAS III del programa de Ingeniería de Sistemas Computacionales de la Universidad Autónoma de Aguascalientes. El sistema está orientado a la gestión de un programa de vida saludable para docentes y administrativos.

## Requerimientos del Sistema

- **Sistema Operativo**: Windows 10 / Linux
- **Lenguaje de Programación**: Java 8
- **Java JDK**: versión 1.8.0_202
- **Modelo CORBA**: OMG para GNU/Linux o Windows
- **Editor**: Visual Studio Code o cualquier entorno de desarrollo para Java

## Estructura de Directorios

La estructura del proyecto debe ser la siguiente:

```
CORBAFinal/
├── client/
├── sUserManagement/
│   ├── sop_corba/
│   └── server/
└── sUserTraking/
    ├── sop_corba/
    └── server/
```

## Descripción de Archivos Fuente

### Archivos IDL

- **gUsers.idl**: Define las interfaces y estructuras para la gestión de personal y usuarios.
- **gPatients.idl**: Define las interfaces y estructuras para la gestión de pacientes.

### Implementaciones

#### Gestión de Usuarios

- **GestionPersonalImpl.java**: Implementación de la gestión de personal.
- **ServerObjets.java**: Servidor de objetos para la gestión de usuarios.

#### Seguimiento de Usuarios

- **GestionPacientesImpl.java**: Implementación de la gestión de pacientes.
- **ServerObjets.java**: Servidor de objetos para el seguimiento de usuarios.

#### Cliente

- **AdmCllbckImpl.java**: Implementación del callback para el administrador.
- **FapCllbckImpl.java**: Implementación del callback para el PAF.
- **ClientObjets.java**: Cliente que consume los servicios de los servidores.

## Compilación y Ejecución

### Compilar IDL

```sh
idlj -fall -pkgPrefix sop_corba sUserManagement gUsers.idl
idlj -fall -pkgPrefix sop_corba sUserTraking gPatients.idl
```

### Compilar Servidor de Seguimiento de Usuarios

```sh
javac -d ../bin sUserTraking/sop_corba/*.java
javac -d ../bin sUserTraking/server/*.java
```

### Compilar Servidor de Gestión de Usuarios

```sh
javac -d ../bin sUserManagement/sop_corba/*.java
javac -d ../bin sUserManagement/server/*.java
```

### Compilar el Cliente

```sh
javac -d ../bin client/*.java
```

### Ejecución

Ubicarse en la carpeta `bin` y seguir los pasos:

1. Lanzar el ORBD:
   ```sh
   orbd -ORBInitialHost localhost -ORBInitialPort 2020
   ```

2. Ejecutar servidor de seguimiento de usuarios:
   ```sh
   java sUserTraking.server.ServerObjets -ORBInitialHost localhost -ORBInitialPort 2020
   ```

3. Ejecutar servidor de gestión de usuarios:
   ```sh
   java sUserManagement.server.ServerObjets -ORBInitialHost localhost -ORBInitialPort 2020
   ```

4. Ejecutar cliente de objetos:
   ```sh
   java client.ClientObjets -ORBInitialHost localhost -ORBInitialPort 2020
   ```
