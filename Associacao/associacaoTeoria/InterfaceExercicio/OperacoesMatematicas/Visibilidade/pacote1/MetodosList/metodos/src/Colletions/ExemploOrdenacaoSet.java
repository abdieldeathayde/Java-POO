package Colletions;

import java.util.HashSet;
import java.util.LinkedHashSet;
/*
 * dadas as seguintes informações sobre minhas séries favoritas, crie um conjunto e ordene este conjunto exibindo:
 * 
 * Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
 * Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
 * Série 3 = nome: that ´70s show, genero: comédia, tempoEpisodio: 25
 */
import java.util.Objects;
import java.util.Set;

import Colletions.Serie;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};   
        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - "
        + serie.getGenero() + " - " + serie.getTempoEisodio() );

        System.out.println("--\tOrdem Inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - "
        + serie.getGenero() + " - " + serie.getTempoEisodio() );
            
        
    }

}
