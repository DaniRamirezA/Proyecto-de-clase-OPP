package com.udea.modelos;

import com.udea.exceptions.PrecioFueraDeRangoException;

import java.util.List;

public interface PropiedadRepositorio  {
    List<Propiedad> listadoPorTipoPropiedades(String tipoPropiedad);

    List<Propiedad> listarTodasLasPropiedades();

    int numeroPropiedadesPorEstrato(int estrato);
    List<Propiedad> busquedaPropiedadPorMatricula(int numeroDeMatricula);
    void ingresarNuevaPropiedad(int matricula, int estrato, String tipoPropiedad, String barrio, int valor) throws PrecioFueraDeRangoException;;

}

