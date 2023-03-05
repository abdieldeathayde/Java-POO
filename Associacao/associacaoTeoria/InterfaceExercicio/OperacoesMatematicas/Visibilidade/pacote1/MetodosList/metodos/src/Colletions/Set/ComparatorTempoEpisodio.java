package Colletions.Set;

import java.util.Comparator;

public class ComparatorTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int TempoEpisodio = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
        if (TempoEpisodio != 0) return TempoEpisodio;

        return TempoEpisodio;
        
    }

}
