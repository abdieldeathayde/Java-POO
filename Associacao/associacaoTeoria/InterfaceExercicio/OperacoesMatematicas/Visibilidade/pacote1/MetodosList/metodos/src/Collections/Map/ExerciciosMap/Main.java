package Collections.Map.ExerciciosMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
// import java.util.Map.Entry;

// import Collections.Map.ExerciciosMap.EstadosNordeste;

public class Main {

    public static void main(String[] args) {
        
        // Map<String, Integer> estadosNordeste = new HashMap<>();
        // estadosNordeste.put("PE", 9616621);
        // estadosNordeste.put("Al", 3351543);
        // estadosNordeste.put("CE", 9187103);
        // estadosNordeste.put("RN", 3534265);

        Map<String, EstadosNordeste> estadosNordeste = new HashMap<>(){{
            put("Estado", new EstadosNordeste("PE", 9616621));
            put("Estado", new EstadosNordeste("AL", 3351543));
            put("Estado", new EstadosNordeste("CE", 9187103));
            put("Estado", new EstadosNordeste("RN", 3534265));
        }};
        System.out.println("Ordem Insercao");

        Map<String, EstadosNordeste> estadosNordeste1 = new LinkedHashMap<>(estadosNordeste){{
            put("Estado", new EstadosNordeste("PE", 9616621));
            put("Estado", new EstadosNordeste("AL", 3351543));
            put("Estado", new EstadosNordeste("CE", 9187103));
            put("Estado", new EstadosNordeste("RN", 3534265));
        }};
        for (Map.Entry<String, EstadosNordeste> estado: estadosNordeste1.entrySet())
            System.out.println(estado.getKey() + " - " + estado.getValue().getNome());


        // estadosNordeste.replace("RN", 3534265, 3534165);
        estadosNordeste.containsKey("PB");
        
        System.out.println("População:  " + estadosNordeste.get("PE"));
        // System.out.println(estadosNordeste.getNome() );
        
    }
    
}

class ComparatorNome implements Comparator<Map.Entry<EstadosNordeste, String>> {

    @Override
    public int compare(Map.Entry<EstadosNordeste, String> estado1, Map.Entry<EstadosNordeste, String> estado2) {
        
        return estado1.getValue().compareToIgnoreCase(estado2.getValue());
    }
}  

class ComparatorPopulacao implements Comparator<Map.Entry<EstadosNordeste, String>> {

    @Override
    public int compare(Map.Entry<EstadosNordeste, String> p1, Map.Entry<EstadosNordeste, String> p2) {
        return p1.getValue().compareTo(p2.getValue());
    }

   

    
}

