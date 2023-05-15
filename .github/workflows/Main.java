package upb.Finalexam;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();

        // Agregar libros a la librería
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Ficción", true);
        Libro libro2 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", "Ficción", true);
        Libro libro3 = new Libro("1984", "George Orwell", "Ciencia ficción", true);

        libreria.agregarLibro(libro1);
        libreria.agregarLibro(libro2);
        libreria.agregarLibro(libro3);

        // Buscar libro por título
        List<Libro> resultadosBusquedaTitulo = libreria.buscarLibroPorTitulo("1984");
        System.out.println("Resultados de búsqueda por título:");
        for (Libro libro : resultadosBusquedaTitulo) {
            System.out.println(libro.getTitulo());
        }

        // Reservar libro
        libreria.reservarLibro(libro1);

        // Comprar libro
        libreria.comprarLibro(libro2);

        // Devolver libro
        libreria.devolverLibro(libro1);

        // Actualizar disponibilidad
        libreria.actualizarDisponibilidad(libro3, false);

        // Buscar libro por autor
        List<Libro> resultadosBusquedaAutor = libreria.buscarLibroPorAutor("Gabriel García Márquez");
        System.out.println("Resultados de búsqueda por autor:");
        for (Libro libro : resultadosBusquedaAutor) {
            System.out.println(libro.getTitulo());
        }
    }
}
