package upb.Finalexam;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> libros;

    public Libreria() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Libro> buscarLibroPorAutor(String autor) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public void reservarLibro(Libro libro) {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            System.out.println("Libro reservado: " + libro.getTitulo());
        } else {
            System.out.println("El libro no está disponible para reserva: " + libro.getTitulo());
        }
    }

    public void comprarLibro(Libro libro) {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            System.out.println("Libro comprado: " + libro.getTitulo());
        } else {
            System.out.println("El libro no está disponible para comprar: " + libro.getTitulo());
        }
    }

    public void devolverLibro(Libro libro) {
    	libro.setDisponible(true);
    	System.out.println("Libro devuelto: " + libro.getTitulo());
    	}

    public void actualizarDisponibilidad(Libro libro, boolean disponible) {
        libro.setDisponible(disponible);
        System.out.println("Disponibilidad actualizada para el libro: " + libro.getTitulo());
    }

    public void generarInformeVentas() {
        // Implementación del informe de ventas
    }

    public List<Libro> recomendarLibros(List<Libro> comprasAnteriores) {
        // Implementación de la generación de recomendaciones basadas en compras anteriores
        return new ArrayList<>(); // Retornamos una lista vacía por simplicidad en este ejemplo
    }}
