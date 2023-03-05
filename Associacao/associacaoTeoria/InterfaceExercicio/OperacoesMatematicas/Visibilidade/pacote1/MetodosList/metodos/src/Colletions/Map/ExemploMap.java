package Colletions.Map;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());


    }
    
}
