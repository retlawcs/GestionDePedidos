# GESTIÓN DE PEDIDOS

## Descripción

Este proyecto es una aplicación de gestión de pedidos. Permite a los usuarios crear, actualizar, eliminar y ver pedidos. También proporciona funcionalidades para gestionar los detalles del pedido, como los productos incluidos en el pedido y la información del cliente.

## Instalación

Para instalar este proyecto, sigue estos pasos:

1. Clona el repositorio: `git clone https://github.com/retlawcs/GestionDePedidos.git`
2. Navega a la carpeta del proyecto: `cd GestionDePedidos`
3. Instalar las dependencias necesarias.
4. Crearse una base de datos en postgresql, cambiar las credenciales para conectarse a la base de datos en posgresql.

## Uso

Para iniciar la aplicación, ejecuta el archivo /presentation/Main.java en la terminal. Esto iniciará la aplicación en tu navegador local.

## Arquitectura

El proyecto sigue un modelo de arquitectura de 3 capas, que incluye:

1. **Capa de Presentación**: Esta capa interactúa directamente con los usuarios y maneja la interfaz de usuario y la navegación del usuario. En este proyecto, la capa de presentación se encuentra en el directorio `/presentation`.

2. **Capa de Lógica de Negocio**: Esta capa contiene toda la lógica de negocio y las reglas del sistema. En este proyecto, la lógica de negocio se encuentra en el directorio `/business`.

3. **Capa de Acceso a Datos**: Esta capa interactúa con la base de datos y maneja todas las operaciones de la base de datos, como la creación, lectura, actualización y eliminación de datos. En este proyecto, la capa de acceso a datos se encuentra en el directorio `/data`.

## Principios SOLID

Este proyecto sigue los principios SOLID, que son un conjunto de principios de diseño de software orientado a objetos. Los principios SOLID incluyen:

1. **Principio de Responsabilidad Única (SRP)**: Cada clase en el proyecto tiene una única responsabilidad. Por ejemplo, las clases en el directorio `/data` son responsables de las operaciones de la base de datos.

2. **Principio Abierto/Cerrado (OCP)**: Las clases del proyecto están abiertas para extensión, pero cerradas para modificación. Esto significa que podemos agregar nuevas funcionalidades sin cambiar el código existente.

3. **Principio de Sustitución de Liskov (LSP)**: Las subclases pueden ser sustituidas por sus clases base sin causar problemas.

4. **Principio de Segregación de Interfaces (ISP)**: Las clases no están forzadas a implementar interfaces que no utilizan.

5. **Principio de Inversión de Dependencias (DIP)**: Las clases de alto nivel no dependen de las clases de bajo nivel. Ambas dependen de abstracciones.

## Patrones de Diseño

Este proyecto utiliza los siguientes patrones de diseño:

1. **Singleton**: Este patrón se utiliza para garantizar que una clase tenga una única instancia, y proporciona un punto de acceso global a ella. En este proyecto, el patrón Singleton se utiliza en la clase `PedidoDAO.java`.

2. **Factory**: Este patrón se utiliza para crear objetos sin especificar la clase exacta que se creará. En este proyecto, el patrón Factory se utiliza en la clase `PedidoFactory.java`.

3. **Strategy**: Este patrón se utiliza para seleccionar un algoritmo en tiempo de ejecución. En este proyecto, el patrón Strategy se utiliza en la clase `Main.java`.

4. **Observer**: Este patrón se utiliza para notificar a los objetos observadores cuando cambia el estado de un objeto. En este proyecto, el patrón Observer se utiliza en la clase `LoggingPedidoValidador.java`.

5. **Decorator**: Este patrón se utiliza para añadir nuevas funcionalidades a un objeto de manera dinámica, sin modificar su comportamiento. En este proyecto, el patrón Decorator se utiliza en la clase `LoggingPedidoValidador.java`, que añade funcionalidades adicionales a la clase `Pedido`.



