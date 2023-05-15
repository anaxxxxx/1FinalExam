package upb.Finalexam;

import java.util.ArrayList;
import java.util.Scanner;

public class Vista {
    private Libreria libreria;

    public Vista() {
        ArrayList<Libro> libros = new ArrayList<Libro>();
        // Agrega libros a la lista libros según tus necesidades

        libreria = new Libreria();
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Libros para Todos -----");
            System.out.println("1. Buscar libros por título");
            System.out.println("2. Buscar libros por autor");
            System.out.println("3. Reservar libro");
            System.out.println("4. Comprar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Agregar libro");
            System.out.println("7. Eliminar libro");
            System.out.println("8. Salir");
            System.out.println("-------------------------------");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título a buscar: ");
                    String titulo = scanner.nextLine();
                    ArrayList<Libro> resultadosTitulo = (ArrayList<Libro>) libreria.buscarLibroPorTitulo(titulo);
                    // Lógica para mostrar los resultados en la vista
                    // ...
                    break;
                case 2:
                    System.out.print("Ingrese el autor a buscar: ");
                    String autor = scanner.nextLine();
                    ArrayList<Libro> resultadosAutor = (ArrayList<Libro>) libreria.buscarLibroPorAutor(autor);
                    // Lógica para mostrar los resultados en la vista
                    // ...
                    break;
                case 3:
                    // Lógica para reservar libro
                    // ...
                    break;
                case 4:
                    // Lógica para comprar libro
                    // ...
                    break;
                case 5:
                    // Lógica para devolver libro
                    // ...
                    break;
                case 6:
                    // Lógica para agregar libro
                    // ...
                    break;
                case 7:
                    // Lógica para eliminar libro
                    // ...
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 8);

        scanner.close();
    }

}
