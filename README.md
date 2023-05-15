# 1FinalExam
//Diseño de arquitectura

//Modelo (Model):
El Modelo se encarga de gestionar los datos y la lógica de negocio de la aplicación. En este caso, el Modelo incluiría las clases y estructuras que representan los libros, como su título, autor, categoría y disponibilidad. Además, también sería responsable de realizar operaciones relacionadas con los libros, como buscar, reservar, comprar, devolver y actualizar su disponibilidad. El Modelo interactuará con la capa de persistencia para almacenar y recuperar los datos de los libros.

Vista (View):
La Vista es responsable de la presentación de la información al usuario y de recopilar la entrada del usuario. En este caso, la Vista estaría encargada de mostrar la interfaz de usuario (UI) a los clientes y administradores de la librería. Esto incluiría la pantalla de búsqueda de libros, la pantalla de reservas, la pantalla de compras, la pantalla de devoluciones, la pantalla de informes de ventas, entre otras. La Vista recibiría información del Modelo para mostrar los datos relevantes y enviaría las interacciones del usuario al Controlador para su procesamiento.

Controlador (Controller):
El Controlador actúa como intermediario entre la Vista y el Modelo. Se encarga de recibir las interacciones del usuario desde la Vista y de coordinar las operaciones correspondientes en el Modelo. En este caso, el Controlador recibiría las solicitudes de búsqueda de libros, reservas, compras, devoluciones, informes de ventas, entre otros, desde la Vista. Luego, se comunicaría con el Modelo para realizar las operaciones necesarias y proporcionaría los datos actualizados a la Vista para su visualización.

//diagramaUML
![diagramaUML](diagramaUML.png)
