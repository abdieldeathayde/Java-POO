package Colletions.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOdem aleatória \t--");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256)); 
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 400)); 
            put(" Harari, Yuvel Noah", new Livro("21 Lições Para o Século 21", 432)); 
        }};

        for (Map.Entry<String, Livro> livro :meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(meusLivros){{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Hawking, Stephen", new Livro("O Poder do Hábito", 256));
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        }};
        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro: meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());



    }

    
    
}


class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }
}