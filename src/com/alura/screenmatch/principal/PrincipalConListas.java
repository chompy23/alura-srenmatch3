package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021);
        miPelicula.evalua(6);
        Pelicula otraPelicula = new Pelicula("Avatar",2023);
        otraPelicula.evalua(8);
        Pelicula favorita = new Pelicula("The Matrix", 1999);
        favorita.evalua(7);
        Pelicula peliculaDeBruno = new Pelicula("El señor de los anillos",2001);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaDeBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(favorita);
        lista.add(lost);

        for (Titulo item : lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula){
                //Pelicula pelicula = (Pelicula) item;
                System.out.println(pelicula.getClasificacion());

            }
        }
        List<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Crus");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas Ordenada "+ listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenada por Nombre: "+lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por Fecha: "+lista);


    }
}
