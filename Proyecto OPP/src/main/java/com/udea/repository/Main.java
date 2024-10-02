package com.udea.repository;

import com.udea.modelos.Propiedad;
import com.udea.repository.RepositorioDeArchivos;
import com.udea.modelos.PropiedadRepositorio;

import java.util.List;

public class Main {public static void main(String[] args) {
    // Se carga el repositorio de archivos con el archivo de prueba "propiedades.txt"
    RepositorioDeArchivos repo = new RepositorioDeArchivos("propiedades.txt");

// CASO 1: Agregar nuevas propiedades
    System.out.println("== Agregando nuevas propiedades ==");
    repo.ingresarNuevaPropiedad(1001, 3, "Apartamento", "Barrio Norte",300000000);
  //  repo.ingresarNuevaPropiedad(1002, 2, "Casa", "Barrio Sur");
  //  repo.ingresarNuevaPropiedad(1003, 4, "Penthouse", "Barrio Este");
    System.out.println("Propiedades añadidas con éxito.\n");
//

    // CASO 2: Búsqueda por matrícula
    System.out.println("== Búsqueda por matrícula ==");
    List<Propiedad> busquedaMatricula = repo.busquedaPropiedadPorMatricula(1001);
    if (busquedaMatricula.isEmpty()) {
        System.out.println("No se encontró ninguna propiedad con la matrícula 1001.");
    } else {
        System.out.println("Propiedad encontrada: " + busquedaMatricula.get(0));
    }
    System.out.println();

    // CASO 3: Listado por tipo de propiedad (Apartamentos)
    System.out.println("== Listado de propiedades tipo 'Apartamento' ==");
    List<Propiedad> apartamentos = repo.listadoPorTipoPropiedades("Apartamento");
    if (apartamentos.isEmpty()) {
        System.out.println("No se encontraron propiedades de tipo 'Apartamento'.");
    } else {
        for (Propiedad apartamento : apartamentos) {
            System.out.println(apartamento);
        }
    }
    System.out.println();

    // CASO 4: Número de propiedades por estrato (Estrato 3)
    System.out.println("== Número de propiedades en el estrato 3 ==");
    int propiedadesEstrato3 = repo.numeroPropiedadesPorEstrato(3);
    System.out.println("Propiedades en estrato 3: " + propiedadesEstrato3);
    System.out.println();

    // CASO 5: Listado completo de propiedades después de todas las operaciones
    System.out.println("== Listado completo de todas las propiedades ==");
    List<Propiedad> todasLasPropiedades = repo.listarTodasLasPropiedades(); // Listamos todo
    if (todasLasPropiedades.isEmpty()) {
        System.out.println("No se encontraron propiedades.");
    } else {
        for (Propiedad propiedad : todasLasPropiedades) {
            System.out.println(propiedad);
        }
    }
}
}